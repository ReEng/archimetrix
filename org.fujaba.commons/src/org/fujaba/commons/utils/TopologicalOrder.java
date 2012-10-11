package org.fujaba.commons.utils;


import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 
 * @author Florian Klein (fklein@upb.de), Andreas Oberhoff
 * @author Last editor: $Author: fklein $
 * @version $Revision: 333 $ $Date: 2007-02-06 00:43:41 +0100 (Di, 06 Feb 2007) $
 * 
 */
public class TopologicalOrder<T>
{
   /**
    * Constructor for class TopologicalOrder
    */
   public TopologicalOrder()
   {
      nodes = new ConcurrentHashMap<String, OrderedNode<T>>();
   }

   private boolean groupRelatedElementsFlag = true;


   public boolean getGroupRelatedElementsFlag()
   {
      return groupRelatedElementsFlag;
   }


   public void setGroupRelatedElementsFlag(boolean groupRelatedElementsFlag)
   {
      this.groupRelatedElementsFlag = groupRelatedElementsFlag;
   }

   private boolean isPreSorted = false;


   /**
    * @see #head()
    */
   private void flagRelatedElements()
   {
      if (!isPreSorted)
      {
         Iterator<OrderedNode<T>> it = iteratorOfNodes();
         while (it.hasNext())
         {
            OrderedNode<T> current = it.next();
            if (current.sizeOfPrevious() == 0)
            {
               current.setRoot(true);
            }
            else
            {
               current.setRoot(false);
            }
         }
         isPreSorted = true;
      }
   }


   public int size()
   {
      return this.nodes.size();
   }


   /**
    * Computes head element in a topological sort, returns null if there are no elements or the
    * remaining elements form a cycle.
    * 
    * If the groupRelatedElementsFlag is not set, head simply returns any node without predecessors.
    * If it is set, two measures are applied: 1) flagRelatedElements()/isRoot() makes sure that if
    * the order graph is not connected, elements from the partitions are not mixed, but placed in
    * consecutive blocks. Thus, an 'unrelated' element from another partition cannot come between
    * 'related' elements from the same partition by chance. 2) Elements with fewer (no) successors
    * are placed first, thus again ensuring that elements with stronger relations are closer
    * together, i.e. if a->b, a->c, b->d, acbd is preferred to abcd because b and d are acquainted.
    * 
    * @return head element
    */
   public OrderedNode<T> head()
   {
      if (groupRelatedElementsFlag && !isPreSorted)
         flagRelatedElements();

      OrderedNode<T> head = null;
      Iterator<OrderedNode<T>> it = iteratorOfNodes();
      while (it.hasNext())
      {
         OrderedNode<T> current = it.next();
         if (current.sizeOfPrevious() == 0)
         {
            if (!groupRelatedElementsFlag)
            {
               return current;
            }

            if (head == null)
            {
               head = current;
            }
            else if (head.isRoot() && !current.isRoot())
            {
               head = current;
            }
            else if (head.isRoot() == current.isRoot()
                  && head.sizeOfNext() > current.sizeOfNext())
            {
               head = current;
            }
         }
      }

      return head;
   }


   /**
    * Return and remove head element
    * 
    * @return head element
    */
   public OrderedNode<T> dequeue()
   {
      OrderedNode<T> head = this.head();
      if (head != null)
      {
         head.removeAllFromNext();
         nodes.remove(getKeyForNode(head));
      }
      return head;
   }

   /**
    * <pre>
    *           *     contains   
    * OrderedNode <------------------------- TopologicalOrder
    *           node      graph
    * </pre>
    */
   private Map<String, OrderedNode<T>> nodes;


   public Map<String, OrderedNode<T>> getNodes()
   {
      return nodes;
   }


   public void add(OrderedNode<T> node)
   {
      nodes.put(getKeyForNode(node), node);
      isPreSorted = false;
   }


   public OrderedNode<T> get(String id)
   {
      if (nodes.containsKey(id))
      {
         return nodes.get(id);
      }
      return null;
   }


   public void remove(String id)
   {
      nodes.remove(id);
      isPreSorted = false;
   }


   public String getKeyForNode(OrderedNode<T> value)
   {
      return (value == null ? null : value.getId());
   }


   public Iterator<OrderedNode<T>> iteratorOfNodes()
   {
      return nodes.values().iterator();
   }
}

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
public class OrderedNode<T>
{
   private T element = null;

   private boolean root = false;

   private String id = "n/a";


   public OrderedNode(String id, T element)
   {
      this.element = element;
      this.id = id;
      this.previous = new ConcurrentHashMap<OrderedNode<T>, Boolean>();
      this.next = new ConcurrentHashMap<OrderedNode<T>, Boolean>();
   }


   public boolean isRoot()
   {
      return root;
   }


   public void setRoot(boolean root)
   {
      this.root = root;
   }


   public void setElement(T element)
   {
      this.element = element;
   }


   public T getElement()
   {
      return element;
   }


   public String getId()
   {
      return id;
   }


   /**
    * <pre>
    *           *     order     * 
    * OrderedNode ------------------------- OrderedNode
    *           next      previous
    * </pre>
    */
   private Map<OrderedNode<T>, Boolean> next;


   public boolean addToNext(OrderedNode<T> value)
   {
      boolean changed = false;
      if (value != null)
      {
         changed = this.next.containsKey(value) == false;
         this.next.put(value, Boolean.TRUE);
         if (changed)
         {
            value.addToPrevious(this);
         }
      }
      return changed;
   }


   public boolean removeFromNext(OrderedNode<T> value)
   {
      boolean changed = false;
      if (value != null)
      {
         changed = this.next.containsKey(value);
         this.next.remove(value);
         if (changed)
         {
            value.removeFromPrevious(this);
         }
      }
      return changed;
   }


   public void removeAllFromNext()
   {
      OrderedNode<T> tmpValue;
      Iterator<OrderedNode<T>> iter = this.iteratorOfNext();
      while (iter.hasNext())
      {
         tmpValue = iter.next();
         this.removeFromNext(tmpValue);
      }
   }


   public boolean hasInNext(OrderedNode<T> value)
   {
      return ((value != null) && this.next.containsKey(value));
   }


   public Iterator<OrderedNode<T>> iteratorOfNext()
   {
      return this.next.keySet().iterator();
   }


   public int sizeOfNext()
   {
      return this.next.size();
   }

   /**
    * <pre>
    *           *     order     * 
    * OrderedNode ------------------------- OrderedNode
    *           previous      next
    * </pre>
    */
   private Map<OrderedNode<T>, Boolean> previous;


   public boolean addToPrevious(OrderedNode<T> value)
   {
      boolean changed = false;
      if (value != null)
      {
         changed = this.previous.containsKey(value) == false;
         this.previous.put(value, Boolean.TRUE);
         if (changed)
         {
            value.addToNext(this);
         }
      }
      return changed;
   }


   public boolean removeFromPrevious(OrderedNode<T> value)
   {
      boolean changed = false;
      if ((value != null))
      {
         changed = this.previous.containsKey(value);
         this.previous.remove(value);
         if (changed)
         {
            value.removeFromNext(this);
         }
      }
      return changed;
   }


   public void removeAllFromPrevious()
   {
      OrderedNode<T> tmpValue;
      Iterator<OrderedNode<T>> iter = this.iteratorOfPrevious();
      while (iter.hasNext())
      {
         tmpValue = iter.next();
         this.removeFromPrevious(tmpValue);
      }
   }


   public boolean hasInPrevious(OrderedNode<T> value)
   {
      return ((value != null) && this.previous.containsKey(value));
   }


   public Iterator<OrderedNode<T>> iteratorOfPrevious()
   {
      return (this.previous.keySet().iterator());
   }


   public int sizeOfPrevious()
   {
      return (this.previous.size());
   }


   public void removeYou()
   {
      this.removeAllFromNext();
      this.removeAllFromPrevious();
   }
}

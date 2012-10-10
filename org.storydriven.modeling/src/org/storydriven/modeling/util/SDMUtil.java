package org.storydriven.modeling.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationChainImpl;

public class SDMUtil
{
   private static NotificationChain add (NotificationChain msgs, Notification notification)
   {
      msgs.add(notification);
      return msgs;
   }

   private static NotificationChain asChain (Notification notification)
   {
      return notification == null ? null : notification instanceof NotificationChain ? (NotificationChain) notification
         : add(new NotificationChainImpl(), notification);
   }

   public static NotificationChain chain (NotificationChain msgs, Notification notification)
   {
      return notification == null ? msgs : msgs == null ? asChain(notification) : add(msgs, notification);
   }

   public static NotificationChain chain (Notification notification1, Notification notification2)
   {
      return notification1 == null ? asChain(notification2) : notification2 == null ? asChain(notification1) : chain(
         asChain(notification1), notification2);
   }

   public static void dispatch (NotificationChain msgs, Notification notification)
   {
      dispatch(chain(msgs, notification));
   }

   public static void dispatch (NotificationChain chain)
   {
      if (chain != null)
      {
         chain.dispatch();
      }
   }
}

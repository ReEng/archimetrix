package org.fujaba.commons.console;


import org.fujaba.commons.console.internal.ProcessConsole;


/**
 * This interface can be used to append messages to a {@link ProcessConsole}. Extend the
 * {@link ConsoleJob} class or use the {@link ProcessConsoleFactory} to receive one.
 * 
 * @noextend This interface should not be extended.
 * @noimplement This interface should not be implemented.
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public interface IProcessConsole
{
   /**
    * Appends the given message to the console with the current time.
    * 
    * @param text The text to append.
    */
   void append(String text);


   /**
    * Appends the given message to the console with a given time stamp.
    * 
    * @param text The text to append.
    * @param timestamp The time stamp.
    */
   void append(String text, long timestamp);


   /**
    * Appends the given message to the console with a given time stamp and a category.
    * 
    * @param text The message to append.
    * @param timestamp The time stamp.
    * @param category A category for the message.
    */
   void append(String text, long timestamp, String category);


   /**
    * Appends the given message to the console with a category.
    * 
    * @param text The message to append.
    * @param category A category for the message.
    */
   void append(String text, String category);


   /**
    * Adds a new listener to the console.
    * 
    * @param listener The listener to add.
    * @return Returns <code>true</code> on success, otherwise <code>false</code>.
    */
   boolean addListener(IProcessConsoleListener listener);


   /**
    * Removes an attached listener from the console.
    * 
    * @param listener The listener to remove.
    * @return Returns <code>true</code> on success, otherwise <code>false</code>.
    */
   boolean removeListener(IProcessConsoleListener listener);
}

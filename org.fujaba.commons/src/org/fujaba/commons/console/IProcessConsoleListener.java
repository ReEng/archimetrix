package org.fujaba.commons.console;


/**
 * Adding an implementing class to the console via the
 * {@link IProcessConsole#addListener(IProcessListener) add method} will inform it on all console
 * (process) state changes.
 * 
 * @version $Revision$ $Date$
 * @author Last editor: $Author$
 * @author harka
 */
public interface IProcessConsoleListener
{
   /**
    * This method is called when the state of a console process changes.
    * 
    * @param state The new state of the process.
    */
   void newState(ProcessConsoleState state);
}

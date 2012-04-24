package org.archimetrix.commons;


/**
 * Provides constants for the handling with pattern specifications.
 * 
 * @author mcp
 * @author Last editor: $Author$
 * @version $Revision$ $Date$
 * 
 */
public interface PatternConstants
{
   public static final String CALLING_CLASS_ROLE = "callingClass";

   public static final String CALLED_CLASS_ROLE = "calledClass";

   public static final String IV_ACCESSED_METHOD_OWNER_ROLE = "accessedMethodOwner";

   public static final String IV_ACCESSING_CLASS_ROLE = "accessingClass";

   public static final String NON_TO_COMMUNICATION_PATTERN_NAME = "NonTOCommunication";

   public static final String DATA_CLASS_PATTERN_NAME = "UndercoverTransferObject";

   public static final String ILLEGAL_METHOD_ACCESS_PATTERN = "IllegalMethodAccess";

   public static final String ILLEGAL_METHOD_ACCESS_BC_PATTERN = "IllegalMethodAccessBetweenComponents";

   public static final String INVALIDATED_ILLEGAL_METHOD_ACCESS_PATTERN = "IllegalMethodAccess_Distorted";

   public static final String INVALIDATED_ILLEGAL_METHOD_ACCESS_BC_PATTERN = "IllegalMethodAccessBetweenComponents_Distorted";

   public static final String NON_TO_ROLE = "nonTO";

   public static final String UNDERCOVER_TO_ROLE = "undercoverTO";
}

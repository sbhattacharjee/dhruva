package com.systems.dhruva.common.util;

/**
 *
 *	Enum object for TestAction class
 *
 *  Example: TestActionEnum.COMMAND.getValue()
 *
 * @author sbhattacharjee
 *
 */
public enum ActionStepEnum {
    COMMAND("command"),
    SELECTOR_TYPE("selectorType"),
    TARGET_LOCATOR("targetLocator");

    private String value = null;

   private ActionStepEnum(String value){
	   this.value = value;
   }

   public String getValue(){
	   return value;
   }
}

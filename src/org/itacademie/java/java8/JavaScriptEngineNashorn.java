package org.itacademie.java.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptEngineNashorn {

	public static void main(String [] args)
	{
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("Nashorn");
		String name = "Testing Java script engine Nashron";
		Integer result = 0;
		
		try{
			nashorn.eval("print('" + name + "')");
	         result = (Integer) nashorn.eval("10 + 2");
	         nashorn.eval("print('"+result+"')");
		}catch(ScriptException e){
			System.out.println("Error executing script: "+ e.getMessage());		}
	}
}

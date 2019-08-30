package com.auto_it_access;

public class What_is_AutoIT_and_its_usage
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
 // What is AutoIt?		
		
		/*
			AutoIt v3 is also freeware. 
			It uses a combination of mouse movement, keystrokes and window control manipulation to automate a task which is not possible by selenium webdriver.
		 */

		
		
// Why Use AutoIt?
		
		/*
		 Selenium is an open source tool that is designed to automate web-based applications on different browsers but to handle window GUI and non HTML popups in application. 
		 AutoIT is required as these window based activity are not handled by Selenium.
		 */
	

	
// Features of AutoIt
	
	
	

	
	/*Easy to learn syntax:
		
		AutoIt uses a very simple syntax for its scripting language, which can be easily learnt and implemented for the automation of any process. 
		The SciTE editor makes it easy by providing the syntax highlighting feature, using which one can get an idea of the syntax of the various predefined functions used.

	Record and playback: 
		
		As previously discussed, AutoIt can even record and generate a script on its own for specific processes that need to be automated. Once recorded, the same script, without any modification, can be used to run and play back the recorded process when required.

	Interaction with all standard Windows controls:
		
		AutoIt can easily interact with all types of standard Windows controls and other GUIs without any object identification issue.
		It identifies a specific control with the help of the control ID, class name, title, position coordinates, visible text, etc – all of which are associated with that Windows control. It can get such properties of an element using the AU3 Info tool.

	Simulates keystrokes and various mouse movements:
		
		AutoIt can even simulate various mouse movements and different keystrokes using the inbuilt ‘Send Key’ function.
		These movements and different key actions can also be recorded and played back afterwards.

	Graphical User Interfaces (GUIs): 
		
		Different GUIs can be provided to different processes, wherever required while automating a specific task, using AutoIt. 
		There are several inbuilt functions under ‘GUI Control Create’ for different GUIs, which can be incorporated. Each of the separate GUI functions has a different syntax, following which we can generate different GUIs like the input box, label, browser window, drop-down menu, etc.

	Calling external DLL and Windows API functions directly:
		
		We can directly call any DLL using AutoIt with the help of its predefined function, DLLcall.
		We can also call any API using this, and can even perform different operations on the Windows API using several _WinAPI_ functions.

	RunAs function: 
		
		AutoIt has an inbuilt RunAs function, which helps in running any external program using some external user.

	Detailed ‘Help’ file and large community-based support forums:
		
		AutoIt comes with AutoIt Help.exe, which provides all the possible help and support information for any learner.
		It even illustrates the automation of several scenarios, where the tool was used.

	Compatibility:
		
		AutoIt is compatible with all Windows versions — Windows XP, 2003, Vista and 2008; Windows 7, 2008 R2, Windows 8 and 2012 R2.

	Compilation of scripts into standalone executables: 
		
		The entire script written using AutoIt can be stored in the form of a .au3 executable, which can be easily compiled and executed by simply clicking on the .au3 executive file. We need not open the script to run it.
	
    */	
	
// Advantages of AutoIt
	
	
	/*1. Supports easy record/playback and simple scripting
	2. Loglines can be debugged easily with consolewritecommand.
	3. AutoIt is an open source tool for which we do not need to pay.
	4. Small standalone executables can be created using AutoIt.
	5. AutoIt can recognise specific areas with pixelchecksum and pixelsearch.
	6. It recognises all basic Windows controls and also has the option to create different GUIs.*/
	
	
 // Disadvantages of AutoIt
	
	/*1. All types of objects are not identified by the AU3 Info tool.
	2. AutoIt has no Java support available so far.
	3. It has no control repository to give an object a logical or technical name.
	4. It does not support all browsers, but only supports Internet Explorer controls by using IE.AU3 or its own COM object references.
	5. Users need to import separate libraries for using different predefined utility functions.
	There are several open source tools available in the market, but we need to evaluate and analyse any specific tool based on our requirements. AutoIt is one tool which can be used to automate various processes associated with Windows and desktop based applications with simple, user-friendly scripting.	
	*/
	}
}

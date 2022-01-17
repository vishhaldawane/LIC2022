
public class Notes {

}
/*




						Java Technology
							|
			-------------------------------------
			|				|			|
			JSE				JEE			JME / android
			standard		enterprise	micro
			|				|			|
			|			---------		mobile computing
			|			|		|
		core java		web		ejb
		|				|		 |
language fundamentals	servlet	----------------------------------
OOPs concept			jsp			|		|				|
packages				angular	 spring		hibernate/JPA	messaging
exception handling		react	
multithreading
generics
collections
file handling
jdbc

						Core Java
						
						
Agenda Day 1
-------------
1. Features of Java
2. Your First Java Program
3. Classes and Objects
4. OOPS concept

	1. Featuers of Java
			
	a. Platform independent
	
	
vendor		Intel				Sun				HP			IBM			ANY				Apple	
h/w|CPU		x86					SParc			hpSeries	blackBoxes	ANY				PowerPc
OS			MS-windows			Solaris			Hp-Ux		AIX			Linux			Macintosh
compiler	c/c++				cc				cc			cc			gcc/g++			cc
			|					|				|			|			|				|
compile		First.c/cpp  -->	First.c/cpp		First.c/cpp First.c/cpp	First.c/cpp	First.c/cpp
			|ASCII				|				|			|			|				|
linking		First.obj			First.o			First.o		First.o		First.o		First.o
			|					|				|			|			|				|
execute ->	First.exe			First.out		First.out	First.out	First.out	First.out
			|					|
			non-portble product file
			
			
vendor		Intel				Sun				HP			IBM			ANY			Apple
h/w|CPU		x86					SParc			hpSeries	blackBoxes	ANY			PowerPc|M1chip
OS			MS-windows			Solaris			Hp-Ux		AIX			Linux		|
JVM			JVM	(CdPlayer)		JVM	(CdPlayer)	JVM			JVM			JVM			JVM
			|	 LG				|	 Sony		|			|			|			|
			|	 Socket			|	 Socket		|			|			|			|
compile		First.java			|				|			|			|			|
			|					|				|			|			|			|
interpret	First.class			YES				YES			YES			YES			YES
			(CD)			First.class -->		First.class	First.class	First.class	First.class
			plug
			 E
			N P
			
			
		what is made first CD or CDPlayer
		
		like egg and hen?
		like male or female?
		like seed or Tree/Fruit?
		
		.class file a bytecode - magic code
		
	portble product file
	
	
	
	b. WORA - write once run anywhere
	c. object oriented
	d. multi threading
	e. dynamic
	f. robust - exception handling, automatic garbage collection
	g. distributed - network/socket programming
	h. simple, highly structured
			- no need of memory management
			- built in allocator and de-allocator for the memory
			- legacy syntax of c/c++ 
			- no pointer
			
	i. secured
	j. compiled and interpreted
			
	

2. Your First Java Program
			|
		---------------------------
		|					|
		command prompt		IDE (Eclipse/Netbeans/IntellJ)
		|					|
javac	First.java			MyProject
			|					|
		First.class			----------------
			|				|			|
java    First				src			bin
							|			|
							First.java	First.class

javac - compiler
java  - interpreter

Data types
-------------

		integer 		123  456
		floating		4.5  66.73399  3.14
		character		'A' 'Y'  'N'   'B'
		String 			"New York" "Pune"  "Mumbai"  "John"
		boolean data	true   false
		
		
						Data types
							|
			---------------------------------------------------------
				|											|
				Primitive								Secondary
				|												|
	-------------------------------------------				---------------
	|				|			|			|							|
	Integral		floating	character	boolean					Object
	|					|		|			|							|
type  size				|		|			|						String
byte	1=  8 bits	float   4	char 2 	boolean 1 true/false
short	2= 16 bits	double  8
int		4= 32 bits
long	8= 64 bits


		1 byte = 8 bits
		
		
		1 bit = 2 presentations
				0 off
				1 on
				
				
		2 bits	= 4 presentations
		  		   0 0
				   0 1
				   1 0
				   1 1
				   
				   
		3 bits = 8 representations
				 0 0 0			= 0
				 0 0 1			= 1
				 0 1 0			= 2
				 0 1 1			= 3 
				 1 0 0			= 4
				 1 0 1			= 5
				 1 1 0			= 6
				 1 1 1			= 7
				 
		4 bits = 16 
		5 bits = 32
		6 bits = 64
		7 bits = 128
		8 bits = 256 = 1 byte 
		
	
		 <------------------------------------->
		 					|
		 -128... -3 -2 -1	0	 1 2 3 ...	127
		 
				 
				 
	Functions
	-----------	
		- is a specific code to do a specific task
		
		
		returnType   functionName(argumentList)
		{
				code to do
				
				return value;
		}

		1. function without arguments 
		and without return value
		
		2. function with arguments
		but without return value
		
		3. function with arguments
		and with return value
		
		4. function without arguments
		but with return value
		


		


















			

*/




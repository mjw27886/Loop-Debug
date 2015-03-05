{\rtf1\ansi\ansicpg1252\cocoartf1344\cocoasubrtf720
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red106\green62\blue62;\red42\green0\blue255;
\red63\green127\blue95;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs22 \cf2 import\cf0  javax.swing.JOptionPane;\
\
\cf2 public\cf0  \cf2 class\cf0  Assignment2 \{\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String [] \cf3 arges\cf0 ) \{\
		String \cf3 one\cf0 , \cf3 two\cf0 , \cf3 three\cf0 , \cf3 four\cf0 , \cf3 five\cf0 ; \
		\cf2 double\cf0  \cf3 one1\cf0 ,\cf3 two2\cf0 ,\cf3 three3\cf0 ,\cf3 four4\cf0 ,\cf3 five5\cf0 , \cf3 addition\cf0 , \cf3 average\cf0 ;\
		\
		JOptionPane.showInputDialog(\cf4 "Please enter 5 numbers and I will give you the result in Addition and Average"\cf0 );\
		\cf3 one\cf0  = JOptionPane.showInputDialog(\cf4 "First Number?"\cf0 ); \cf5 //Enter the first number.\cf0 \
		\cf3 two\cf0  = JOptionPane.showInputDialog(\cf4 "Second Number?"\cf0 ); \cf5 // Enter the second number.\cf0 \
		\cf3 three\cf0  = JOptionPane.showInputDialog(\cf4 "Third Number?"\cf0 ); \cf5 //Enter the third number.\cf0 \
		\cf3 four\cf0  = JOptionPane.showInputDialog(\cf4 "Fourth Number?"\cf0 ); \cf5 //Enter the fourth number.\cf0 \
		\cf3 five\cf0  = JOptionPane.showInputDialog(\cf4 "Fifth Number?"\cf0 ); \cf5 // Enter the fifth number.\cf0 \
		\cf3 one1\cf0  = Double.parseDouble(\cf3 one\cf0 );\
		\cf3 two2\cf0  = Double.parseDouble(\cf3 two\cf0 );\
		\cf3 three3\cf0  = Double.parseDouble(\cf3 three\cf0 );\
		\cf3 four4\cf0  = Double.parseDouble(\cf3 four\cf0 );\
		\cf3 five5\cf0  = Double.parseDouble(\cf3 five\cf0 );\
		\cf3 addition\cf0  = \cf3 one1\cf0  + \cf3 two2\cf0  + \cf3 three3\cf0  + \cf3 four4\cf0  + \cf3 five5\cf0 ; \cf5 // It will add all your numbers and give.\cf0 \
		\cf3 average\cf0  = \cf3 addition\cf0  / 5; \cf5 //This gives you the average number.\cf0 \
		JOptionPane.showMessageDialog(\cf2 null\cf0 , \cf4 "Total in addition: "\cf0  + \cf3 addition\cf0  + \cf4 "\\n"\cf0  + \cf4 "Average is: "\cf0  + \cf3 average\cf0 );\
		\cf5 // Last one gives you both of the answers and show in JOption Pane.\cf0 \
	\}\
\
\}\
}
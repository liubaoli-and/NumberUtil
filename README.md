# NumberUtil
The NumberUtil program is a data type conversion program provided by a java number toolkit. The main function is to convert String data into Number data. The program calculates the string into a decimal number based on the string information related to the String data.<br>
1.Input specifications
| 输入参数       | 参数类型  |  限制  |描述|
| ----| -----| ---- |----|
| str | string | | input string| 
| initials|  int |  only  number 0-12| initial character type , 0 means starting with 0, 1-9 means starting with 1-9, numbers 10, 11, 12 are starting with 0x, 0X, #, and 12 means other|
| typeQualifier | int | only numbers 0-2|  Type qualifiers 1-2 are "l" and "L" respectively, and 0 means none| 
2.Output specifications<br>
The output parameter name is number and the type is Number. The Number type is the parent class of various numeric data types.<br>
3.Description of MRs<br>
The input of the service to be tested is divided into equivalence classes, and then the MRs is designed by analyzing the necessary attributes existing between different equivalence classes. 
<table>
<tr><td>sequence </td><td>R</td><td> Rf</td></tr>
<tr><td colspan="3">1.initials=0x, 0X, #, typeQualifier=0</td></tr>
<tr><td>MR1</td><td>str_=str+1(0=\<str\<7fffffff)</td><td>number_=number+1</td></tr>
<tr><td>MR2</td><td>str_=str+1(7fffffff\<str\<7fffffffffffffff) </td><td>number_=number+1</td></tr>
<tr><td>MR3</td><td>str_=str+1(7fffffffffffffff\<str)</td><td>number_=number+1</td></tr>
<tr><td colspan="3">2.initials=0, typeQualifier=0</td></tr>
<tr><td>MR4</td><td>str_=str+1(0=\<str\<017777777777)</td><td>number_=number+1</td></tr>
<tr><td>MR5</td><td>str_=str+1(017777777777\<str\<077777777777777777777)</td><td>number_=number+1</td></tr>
<tr><td>MR6</td><td>str_=str+1(0777777777777777777777\<str)</td><td>number_=number+1</td></tr>
<tr><td colspan="3">3.initials=0, typeQualifier=1/2</td></tr>
<tr><td>MR7 </td><td>str_=str+1(0=\<str\<0777777777777777777777) </td><td>number_=number+1</td></tr>
<tr><td>MR8 </td><td>str_=str+1(0777777777777777777777\<str) </td><td>number_=number+1</td></tr>
<tr><td colspan="3">4.initials=1/2/3/4/5/6/7/8/9, typeQualifier=0</td></tr>
<tr><td>MR9 </td><td>str_=str+1(0=\<str\<2147483647)</td><td>number_=number+1</td></tr>
<tr><td>MR10 </td><td>str_=str+1(2147483647\<str<\9223372036854775807)</td><td>number_=number+1</td></tr>
<tr><td>MR11</td><td>str_=str+1(9223372036854775807\<str) </td><td>number_=number+1</td></tr>
<tr><td colspan="3">5.initials=1/2/3/4/5/6/7/8/9, typeQualifier=1/2</td></tr>
<tr><td>MR12 </td><td>str_=str+1(0\<=str\<9223372036854775807)</td><td>number_=number+1</td></tr>
<tr><td>MR13 </td><td>str_=str+1(9223372036854775807\<str) </td><td>number_=number+1</td></tr>
</table>

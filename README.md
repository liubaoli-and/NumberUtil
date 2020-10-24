# NumberUtil
The NumberUtil program is a data type conversion program provided by a java number toolkit. The main function is to convert String data into Number data. The program calculates the string into a decimal number based on the string information related to the String data.

1. Input specifications

| Inputs       | Types  |  Limits  |Description|
| ----| -----| ---- |----|
| str | string | | input string|
| initials|  int |  only  number 0-12| initial character type , 0 means starting with 0, 1-9 means starting with 1-9, numbers 10, 11, 12 are starting with 0x, 0X, #, and 12 means other|
| typeQualifier | int | only numbers 0-2|  Type qualifiers 1-2 are "l" and "L" respectively, and 0 means none|
2. Output specifications

   The output parameter name is number and the type is Number. The Number type is the parent class of various numeric data types.

3. Description of MRs

   The input of the service to be tested is divided into equivalence classes, and then the MRs is designed by analyzing the necessary attributes existing between different equivalence classes. 

   ![](https://cdn.jsdelivr.net/gh/Evan-ZJ/MyPic/img/20201024215839.png)

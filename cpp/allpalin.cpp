#include <cstring>
#include <iostream>

using namespace std;

void substring(char _o_str[], char _str[], unsigned int _start, unsigned int _end)
{
 if (_start < 0 || _end < 0 || _end >= strlen(_str))
  _o_str[0] = '\0';//return "\0";

 char tmp[1000];
 int i, j;
 for (i= _start, j =0; i <= _end && i < strlen(_str); i++, j++)
  tmp[j] = _str[i];
 tmp[j] = '\0';

 strcpy(_o_str, tmp);
}

int palin(char str[])
{
 char str2[strlen(str)];
 int j =0;
 for (int i = strlen(str); i>0; i--, j++)
  str2[j] = str[i-1];
 str2[j]= '\0';
 return strcmp(str, str2);
}

int main()
{
 char inp_str[] = ")@IDODKKER(R*U@EIJEDOSMADAMSFIJSDOFFU@!*!DHIERGOWEDOFJ";// = "varun kumar ramuk nurav";
 char tmp_str[1000];

 int len = strlen(inp_str);
 cout<<"len "<<len<<endl;
 int i , j;
 for (i =0;i < len; i++)
 {
  for (j = i+1; j < len; j++)
  {
   substring(tmp_str, inp_str, i, j);
   if (palin(tmp_str) == 0)
    cout<< tmp_str<<endl;
  }
 }

 return 0;
}

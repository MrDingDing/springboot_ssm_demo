#!/usr/bin/env bash
#blackjack:读取host  将读取的host文件的数据封装到数组中  打印
echo hello world;
LOOP_LIMIT=9
for (( VAR = 0; VAR < ${LOOP_LIMIT}; ++VAR )); do
    # read VAR;  #将读进去的数值赋值给变量VAR
    echo test${VAR};
done
cat hosts | while read line      #注意读取脚本会忽略最后一行  也就是说最后一行
do
   echo $line
done
read -p "please input your first name:" firstName
echo -e "\n your name is:" $firstName


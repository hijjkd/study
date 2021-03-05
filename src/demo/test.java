package demo;

////用来统计每个数字bai出现的次数du
// Map<Integer, Integer>map=newHashMap<>();
//
//        System.out.println("请输入任意个数字（输入-1结束）");
//        Scannerscanner=newScanner(System.in);
//        intinput;
//        while((input=scanner.nextInt())!=-1){
//        Integercount=map.get(input);
//        map.put(input,count==null?1:count+1);
//        }
//
//        intsize=map.size();
//        int[]num=newint[size];//存储输入数字
//        int[]count=newint[size];//存储对应数字的zhi次数
//        inti=0;
//        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
//        num[i]=entry.getKey();
//        count[i]=entry.getValue();
//        i++;
//        }
//
//        //根据出现次数排序
//        for(intj=0;j<size-1;j++){
//        for(intk=j;k<size;k++){
//        if(count[j]<count[k]){
//        inttemp=count[j];
//        count[j]=count[k];
//        count[k]=temp;
//
//        //数字数组也同步交换
//        temp=num[j];
//        num[j]=num[k];
//        num[k]=temp;
//        }
//        }
//        }
//
//        //输入
//        System.out.println("数字\t次数");
//        for(intj=0;j<size;j++){
//        System.out.println(num[j]+"\t"+count[j]);
//        }
/*
 *author: ourfor
 *date: 2018-11-02
 *description: 利用异或运算对输入的内容加密
 */

import java.util.*;
public class encrypt {
		//属性：
        String rsa="";
        String content_ori="";
        String encrypt="";
        String content_decode="";
        char key='a';

		//方法:
    void Start(){
		Welcome();
		PrintMenu();
		Select();

    }

	void PrintMenu(){
		System.out.println("1)输入原始内容以及密钥对原始内容进行加密\n2)输入加密后的内容以及密钥对加密内容进行解密\n3)退出本程序。");
		System.out.print(":");
	}
	void Welcome(){
		System.out.println("Nice to meet you!\n本程序由Sagit开发，仅用于交流学习请勿用于商业用途\n技术支持:https://ourfor.top\nqq:2320813747\n接下来要做什么呢？输入选项对应的数字执行相应操作:");
	}
	void Encrypt(){
        System.out.println("输入你想加密的内容：");
        Scanner input = new Scanner(System.in);
        content_ori=input.nextLine();
        System.out.println("输入你使用的密钥:");
        rsa=input.nextLine();
        for(int i=0;i<content_ori.length();i++){
            key=rsa.charAt(i%rsa.length());
            encrypt+=(char)(content_ori.charAt(i)^key);
        }

        System.out.println("加密后的内容为:"+encrypt);
	}
	void Decode(){
		System.out.println("输入你要解密的内容:");
        Scanner input = new Scanner(System.in);
        content_ori=input.nextLine();
        System.out.println("输入你使用的密钥:");
        rsa=input.nextLine();
        for(int i=0;i<content_ori.length();i++){
            key=rsa.charAt(i%rsa.length());
            encrypt+=(char)(content_ori.charAt(i)^key);
        }

        System.out.println("解密后的内容为:"+encrypt);
	}


	void Select(){
		int select_num=1;
		Scanner reader=new Scanner(System.in);
		select_num=reader.nextInt();
		switch(select_num){
			case 1: Encrypt();
			break;
			case 2: Decode();
			break;
		}

	}
}
 

/*
 * author:ourfor 
 * date: 2018 09 07
 * discription: using java to write binary
 * create, order, level, leaves
 */
public class binary_tree{
//二叉树的节点
typedef struct BiNode{
	char data;    //数据域
	struct BiNode *lchild,*rchild;  //指针域 左孩子 右孩子
}* BiTree,BiNode;

//二叉树的建立
void Create(BiTree &T){
	char ch;
	scanf("%c",&ch);
	if(ch == ' ') T=NULL; // 空树
	else{
		T=new BiTree;
		T->data=ch;
		Create(T->lchild);
		Create(T->rchild);

	}
}

//二叉树的先序便利
void Preorder(BiTree T){
	if(T){
		System.out.printf("%c",T->data);
		Preorder(T->lchild);
		Preorder(T->rchild);
	
	}

}
	public static void main(String args[]){
		BiTree T;
		System.out.printf("please input the root of the tree:\n");
		Create(T);
		System.out.printf("the preorder of this tree is:\n");
		Preorder(T);

	}
}

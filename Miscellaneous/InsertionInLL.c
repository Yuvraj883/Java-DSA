#include<stdio.h>
#include<stdlib.h>
struct node
{
    int num;
    struct node *link;
};
int main()
{
    int n;
    printf("Input the no. of nodes- ");
    scanf("%d", &n);
    struct node *head, *temp, *nxtnode;
    // head = (struct node *)malloc(sizeof(struct node));
    //  temp = head;
    int num;
    for(int i=1; i<=n; i++)
     {
        nxtnode = (struct node *)malloc(sizeof(struct node));
        printf("Insert data for node %d- ",i);
    //     scanf("%d",&num);
    //     temp->num = num;
    //     temp->link = nxtnode;
    //     if(i==n)
    //     {
    //         free(nxtnode);
    //         temp->link = NULL;
    //     }
    scanf("%d",&nxtnode->num);
    nxtnode->link = NULL;
    if(head==NULL){
        head = nxtnode; 
        
    }
    else{
        nxtnode->link = head;
         head = nxtnode;
    }
    }
    printf("list is created\n Elements are- ");
    temp = head;
    while(temp!=NULL)
    {
        printf("%d ",temp->num);
        temp = temp->link;
    }
    return 0;
}
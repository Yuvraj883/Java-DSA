#include<stdio.h>
#include<stdlib.h>
struct node
{
	int item;
	struct node *prev,*next;	
};
struct node* create()
{
	struct node *n;
	n=(struct node*)malloc(sizeof(struct node));
	return n;
}
void enqueuef(struct node **s,int data)
{
	struct node *n;
	n=create();
	n->item=data;
	if(*s==NULL)
	{
		n->next=n;
		n->prev=n;
		*s=n;
	} 
	else
	{
		n->next=(*s)->next;
		n->prev=*s;
		n->next->prev=n;
		(*s)->next=n;
	}
}
void enqueuel(struct node **s,int data)
{
	enqueuef(&(*s),data);
	*s=(*s)->next;
}
void dequeuef(struct node **s)
{
	struct node *t;
	if(*s==NULL)
	printf("Underflow");
	else
	{
		t=(*s)->next;
		(*s)->next=t->next;
		t->next->prev=*s;
		if(*s==t)
		*s=NULL;
		free(t);
	}
}
void dequeuel(struct node **s)
{
	struct node *t;
	if(*s==NULL)
	printf("Underflow");
	else
	{
		t=*s;
		*s=t->prev;
		t->next->prev=*s;
		(*s)->next=t->next;
		if(*s==t)
		*s=NULL;
		free(t);
	}
}
void traverse(struct node *s)
{
	struct node *t;
    
	t=s->next;
	while(t!=s)
	{
		printf("%d ",t->item);
		t=t->next;
	}
	printf("%d \n",t->item);
}
int main()
{
	struct node *start=NULL;
	enqueuef(&start,10);
	enqueuef(&start,20);
	enqueuef(&start,30);
	enqueuel(&start,40);
	enqueuel(&start,50);
	traverse(start);
	dequeuef(&start);
	dequeuef(&start);
	traverse(start);
	dequeuel(&start);
	dequeuel(&start);
	traverse(start);
}

#include <iostream> 
using namespace std; 

class Graphics{
    public: 
  void show(){
        cout<<"Graphics class"<<endl;
    }
    virtual void display(){
        cout<<"VFD Graphics Class"<<endl;
    }
}; 

class Circle : public Graphics{
    public:
    void show(){
        cout<<"Circle Class"<<endl; 
    }
    void display(){
        cout<<"D Circle Class"<<endl;
    }
};

int main(){
    Graphics g; 
    Graphics *gPtr;
    gPtr = &g; 
    gPtr->show(); 
    gPtr->display(); 
    
    Circle c; 
    gPtr = &c; 
    gPtr->show(); 
    gPtr->display(); 
    
    return 0;
    // Circle c; 
    // c.show(); 
    // c.display(); 
}
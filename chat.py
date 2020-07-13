from tkinter import*
import sys
import time
import socket

med=Tk()
med.geometry("1600x800+0+0")
med.title("MED6")

Tops=Frame(med,width=1400,height=1600,bg="purple",relief=SUNKEN)
Tops.pack(side=TOP)

localtime=time.asctime(time.localtime(time.time()))

lblinfo=Label(Tops,font=('arial',50,'bold'),text="MED6",fg='purple',bd=10,anchor='w')
lblinfo.grid(row=0,column=0)

lblinfo=Label(Tops,font=('arial',30,'bold'),text=localtime,fg='purple',bd=10,anchor='w')
lblinfo.grid(row=1,column=0)

host=StringVar()

host=socket.gethostname()

lbl=Label(Tops,font=('arial',20,'bold'),fg='red',bd=40,text=host,anchor='w')
lbl.grid(row=2,column=1)

lbl=Label(Tops,font=('arial',20,'bold'),fg='black',bd=40,text="YOUR HOST NAME",anchor='w')
lbl.grid(row=2,column=0)

s=socket.socket()
port=8080
s.bind((host,port))

def server():
    
    lbl=Label(Tops,font=('arial',10,'bold'),fg='black',bd=10,text="Server done bunding and is waiting for the incoming connecction....",anchor='w')
    lbl.grid(row=5,column=0)
    print("")
    s.listen(1)
    conn,addr=s.accept()
    lbl=Label(Tops,font=('arial',10,'bold'),fg='black',bd=10,text="Has connected to the server and is now online....",anchor='w')
    lbl.grid(row=5,column=0)
    print("")
    while(1):
        txtttl=Entry(Tops,font=('arial',50,'bold'),textvariable=message,bd=10,insertwidth=4,bg='cyan',justify='left')
        txtttl.grid(row=4,column=0)
        message=message.encode()
        conn.send(message)
        lbl=Label(Tops,font=('arial',10,'bold'),fg='black',bd=10,text="Message has been sent",anchor='w')
        lbl.grid(row=5,column=0)
        print("")
        incoming_message=conn.recv(1024)
        incoming_message=incoming_message.decode()
        lbl=Label(Tops,font=('arial',10,'bold'),fg='black',bd=10,text="Client",anchor='w')
        lbl.grid(row=6,column=0) 
        lbl=Label(Tops,font=('arial',10,'bold'),fg='black',bd=10,text=incoming_message,anchor='w')
        lbl.grid(row=6,column=1)
        print("")

host2=StringVar()

def client():
    host2=input(str("Please enter the hostname of the server: "))
    port=8080
    s.connect((host2,port))
    print("Connected to the server")
    while 1:
        incoming_message=s.recv(1024)
        incoming_message=incoming_message.decode()
        print("Server: ",incoming_message)
        print("")
        message=input(str(">>"))
        message=message.encode()
        s.send(message)
        print("Message has been sent....")
        print("")

srvr=Button(Tops,padx=16,pady=16,bd=8,bg="blue",fg="black",font=('arial',20,'bold'),text="CREATE HOST",command=lambda:server())
srvr.grid(row=3,column=0)
srvr=Button(Tops,padx=16,pady=16,bd=8,bg="blue",fg="black",font=('arial',20,'bold'),text="JOIN HOST",command=lambda:server())
srvr.grid(row=3,column=1)

txtttl=Entry(Tops,font=('arial',50,'bold'),textvariable="hello",bd=10,insertwidth=4,bg='cyan',justify='left')
txtttl.grid(row=4,column=0)

med.mainloop()

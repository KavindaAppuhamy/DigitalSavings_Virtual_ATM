    class Node
    {
        // previous Address = use to store previous address
        // net Address = use to store next address
        Node previousAddress, nextAddress;
     private Customer customer;
        public Node(Node preAddrs, Node nextAddrs, Customer customer) {
            this.previousAddress = preAddrs;
            this.nextAddress = nextAddrs;
            this.customer = customer;
        }

        public Node() {
            previousAddress =null;
            nextAddress =null;
        }
        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }



    }

    public class LinkedList {

        Node head;

        public LinkedList() {
           this.head=null;

        }



         public void insertBegin(Customer customer)
         {
                Node node= new Node();
                node.setCustomer(customer);

             if(head==null)
           {
                  head=node;
           }

           else
           {
               node.nextAddress = head;
               head.previousAddress = node;
               head=node;


           }



         }


         public Customer getInfo(String cnic)
         {
               Node temp=head;

               while(temp!=null)
               {

                   if(cnic.equals(temp.getCustomer().getCnic()))
                        return temp.getCustomer();
                         temp=temp.nextAddress;

               }
               return null;

         }


        public int size()
         {
               Node temp=head;
               int size=0;
               while(temp!=null)
               {
                   size++;
                   temp=temp.nextAddress;

               }
               return size;

         }

         public String allData()
         {
               Node temp=head;
               String data="";
               while(temp!=null)
               {
                   data+=temp.getCustomer().toString()+"\n";
                   temp=temp.nextAddress;

               }
               return data;

         }

        boolean check(String card) {
             Node temp=head;

               while(temp!=null)
               {

                   if(card.equals(temp.getCustomer().getCard()))
                   {
                       return true;
                   }
                   temp=temp.nextAddress;

               }
               return false;
        }

        boolean isExist(String text) {
          Node temp=head;

               while(temp!=null)
               {

                   if(text.equals(temp.getCustomer().getCnic()))
                   {
                       return true;
                   }
                   temp=temp.nextAddress;

               }
               return false;
        }

        String cuNicInfo(String text) {
             Node temp=head;

               while(temp!=null)
               {

                   if(text.equals(temp.getCustomer().getCnic()))
                   {
                       return "\nCNIC                          ="+temp.getCustomer().getCnic()
                             +"\nName                          ="+temp.getCustomer().getName()
                             +"\nPIN                           ="+temp.getCustomer().getPin()
                             +"\nCard#                         ="+temp.getCustomer().getCard()
                             +"\nAccount#                      ="+temp.getCustomer().getAccountNo()
                             +"\nBalance                       ="+temp.getCustomer().getBalance();

                   }
                   temp=temp.nextAddress;

               }
               return "";
        }

        String deposit(String text, double amount) {
        Node temp=head;

               while(temp!=null)
               {

                   if(text.equals(temp.getCustomer().getCnic()))
                   {
                       temp.getCustomer().deposit(amount);

                      return "";
                   }
                   temp=temp.nextAddress;

               }
               return "";

        }

        void withdraw(Customer cuss) {
        Node temp=head;

               while(temp!=null)
               {

                   if(cuss.getCnic().equals(temp.getCustomer().getCnic()))
                   {
                       temp.setCustomer(cuss);
                       break;
                   }
                   temp=temp.nextAddress;

               }

        }



        Customer checkPinCard(String pin, String card) {
        Node temp=head;
               while(temp!=null) {
                   if(pin.equals(temp.getCustomer().getPin()+"") && card.equals(temp.getCustomer().getCard()) )
                   {return temp.getCustomer();
                   }
                   temp=temp.nextAddress;
               }
               return null;
        }
    }
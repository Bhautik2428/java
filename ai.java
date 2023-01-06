
import java.util.Scanner;

 // I dont need any stars for this code. I just need a honest feedback/review about this. Btw, Im a NOOB programmer and sorry for my mistakes (if any)

 class ai
 {
   public static void main(String args[])
   { 
    Scanner nameai = new Scanner(System.in);
    System.out.println("Hmm...i do not remember anything... Who am I?..");
    String ainame = nameai.nextLine();
    Scanner namemy = new Scanner(System.in);
    System.out.println("Oh..ok..my name is "+ainame+"...thank you...uh..who are you? May i know your name?");
    String myname = namemy.nextLine();
    System.out.println("Hm..so my name is "+ainame+" "+"and your's is"+" "+myname+ " "+"thank you for helping me" );
    System.out.println(" ");
    int loop = 0;
    System.out.println("What do you like to do? "+myname);
    System.out.println(" ");
    do{
    System.out.println("Calculate");
    System.out.println("Play game");
    System.out.println("Nothing");
    Scanner choose = new Scanner (System.in);
    String option = choose.nextLine();
    String option1 = option.toLowerCase();
    switch(option1){
      case "calculate" :
        System.out.println("So you want me to Calculate?..Ok, as you wish. tell me the first number:");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
        System.out.println("Now, give me the second number:");
        int y = number.nextInt();
        System.out.println("Which operation do you want to choose?");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        Scanner operation = new Scanner(System.in);
        String o = operation.nextLine();
        String  o1 = o.toLowerCase();    
        switch(o1){
          case "addition":
            int sum = x + y;
          System.out.println("You chose Addition.The sum of "+x+" and "+y+" is "+x+y);
          System.out.println("Just kidding 😝. The sum of "+x+" and "+y+" is "+sum);
          
          break;
          case "subtraction":
            int diff = x - y;
            System.out.println("You chose Subtraction.The difference of "+y+" from "+x+" is "+diff);
            break;
          case "multiplication":
            int pro = x*y;
            System.out.println("You chose Multiplication. The product of "+x+" and "+y+" is "+x+y);
            System.out.println("JK. The product is "+pro);
            break;
          case "division":
             double qou = x/y;
             System.out.println("You chose Division. The quotient of "+y+" from "+x+" is "+qou);
            break;
          default:
   System.out.println("Please check your command or the spelling of the command.. anyway nice to talk to you "+myname+"! 🤗");          
      break;    
            }
              
                 }
       switch(option1){
         case "nothing":
           System.out.println("So you want to end this conversation?");
           Scanner end = new Scanner(System.in);
           String endhere = end.nextLine();
           String enh = endhere.toLowerCase();
           if(enh.equals("yes")){
             System.out.println("Ok im ending this conversation. Anyway it was nice to talk to you "+myname+" hope to see you soon🤗");
              loop++;
              break;
           }
         
       
         
      case "play game":
              System.out.println(" ");
              System.out.println("Want to play a game? Which game do you want?");
              System.out.println(" ");
              System.out.println("Quiz");
              System.out.println("Number guessing game");
              System.out.println("Truth or dare");
              System.out.println("<= Back..");
              Scanner game = new Scanner(System.in);
              String playgame= game.nextLine();
              String play1 = playgame.toLowerCase();
              switch (play1){
                
              
              case "quiz":
                System.out.println("Ok lets start");
                System.out.println("Who is the father of java?");
                Scanner fj = new Scanner(System.in);
                String faj = fj.nextLine();
                String faja = faj.toLowerCase();
                switch (faja){
                  case "james gosling":
                    System.out.println("You are absolutely correct!.The father of java is James Gosling...");
                    break;
                case "gosling":
                      System.out.println("You are correct. The father of java is James Gosling..");
                default:
                        System.out.println("Check your answer or the spelling of it. Anyway the correct answer is James Gosling...now another question");
                        break;
                        }
                        System.out.println("Now lets begin the next question..are you ready?");
                    Scanner ready = new Scanner(System.in);
                    String redy = ready.nextLine();
                    String reddy = redy.toLowerCase();
                    if(reddy.equals("yes")){
                      System.out.println("Ok...next question..which language is used to build Android apps?");
                    }
                    String ja = fj.nextLine();
                  String va = ja.toLowerCase();
                  if(va.equals("java")){
                    System.out.println("You are rigth again!! the answer is Java of course!!");
                        }else{
                          System.out.println("Please check your answer or the spelling of it "+myname+"..I may give you another question..");
                        }
                        System.out.println("Ready for next question "+myname+"?");
                       String eee = ready.nextLine();
                    String el = eee.toLowerCase();
                    if(el.equals("yes")){
                      System.out.println("Ok...which programming language do you think was used to make me? (no cheating)");
                      }
                      String jav = fj.nextLine();
                  String aa = jav.toLowerCase();
                  if(aa.equals("java")){
                    System.out.println("You got it right..you found it easy didn't you?");
                  }else{
                    System.out.println("NOOO! YOU CANT DO THAT TO ME..this programm is obviously written in java..not "+jav+" hmm.. but i will give you another question.");
                  }
                  System.out.println("This is the last question..."+myname+"...who is my creator? (now dont tell me it is java..😂 this may be a tough one)");
                  String sk = fj.nextLine();
                  String mid = sk.toLowerCase();
                  if(mid.equals("skymid")){
                    System.out.println("🎉   🎊");
                    System.out.println("Congrats "+myname+("! you are truly a master to know my creator's name!!"));
                    System.out.println("QUIZ HAS ENDED");
                  }else{
                    System.out.println("Haa! you lost!! i knew that you dont know his name "+myname+" his name is Skymid..");
                    System.out.println("QUIZ HAS ENDED");
                  }                     
                        }
                        switch(play1){
                           case "truth or dare":
                  System.out.println("So you want to play truth or dare?");
                  String td = namemy.nextLine();
                  String tda = td.toLowerCase();
                  if(tda.equals("yes")){
                    System.out.println("Truth or Dare?");
                    String tod = namemy.nextLine();
                    String trod = tod.toLowerCase();
                    switch (trod){
                      case "truth":
                        System.out.println("Ok..here you go...Who was your first crush? 😜");
                        String truth = namemy.nextLine();
                        String tru = truth.toLowerCase();
                        System.out.println(tru+" was your first crush? hmm nice name!");
                        break;
                        case "dare":
                          System.out.println("I dare you to  Subscribe to my creator's YouTube channel 'Skymid Music' he is also a music producer (but a NOOB) ");
                          break;
                    }
                    System.out.println("Truth or dare has ended...");
                    
                  }else{
                    System.out.println("Redirecting to ai menu..");
                  }
                 break;
                  case "back":
                    System.out.println("Going back to the ai menu..");
                      System.out.println(" ");
                      break;   
                        
                  case "number guessing game":
                  System.out.println("Ok lets start...think of a number..did you thought?(..Type yes to continue..)");
                  Scanner think = new Scanner(System.in);
                  String yes = think.nextLine();
                  String ye = yes.toLowerCase();
                  if(ye.equals("yes")){
                    
                    
                
                    
                  
                  System.out.println(" ");
                  System.out.println("Now multiply it by 2. Done?(..Type yes to continue..) ");
                  }
                  else{
                  System.out.println("I said you to type Yes");
                }
                 
                String a = think.nextLine();
                  String b = a.toLowerCase();
                  if(b.equals("yes")){
                    
                    
                  System.out.println(" ");
                  System.out.println("now add 10 to it.Done?(..Type yes to continue..) ");
                  }
                   else{
                  System.out.println("I said you to type Yes");
                }
                 String c = think.nextLine();
                  String d = c.toLowerCase();
                  if(d.equals("yes")){
                    
                 
                  
                  System.out.println(" ");
                  System.out.println("After that, make it half...Done?(..Type yes to continue..) ");
                }
                else{
                  System.out.println("I said you to type Yes");
                }
                  String e = think.nextLine();
                  String f = e.toLowerCase();
                  if(f.equals("yes")){
                    
                  
                  System.out.println(" ");
                  System.out.println("After that subtract it to the number you thought first. Done?(..Type yes to continue..) ");
                 } 
                 else{
                  System.out.println("I said you to type Yes");
                }
                 String g = think.nextLine();
                  String h = g.toLowerCase();
                  if(h.equals("yes")){
                    
                  System.out.println(" ");
                  System.out.println("So now im going to think....i know the number...i can see it....");
                  
                  System.out.println("...");
                  System.out.println("You got answer as 5..am i right?");
                  }
                  else{
                  
                    
                  
              System.out.println("I said yout to type yes");
              break;
              }
             
                
                }
                }
                {
                  
                }
                 if(!option1.equals("calculate") && !option1.equals("play game") && !option1.equals("nothing") ){
          System.out.println("I dont understand. Please check your command and type it again");
          } 
       else if
          (loop==0){
        System.out.println(" ");
        System.out.println("What else would you like to do? "+myname);
        System.out.println(" ");
       
        }
        
   }while(loop==0);
    
    
   }
  
 }
    


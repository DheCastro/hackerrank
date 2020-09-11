static Scanner scan = new Scanner(System.in);
static boolean flag;
static int H, B;

static{

    //Initialization entries
    H = scan.nextInt();
    B = scan.nextInt();
    flag = true;

    try{
        if(H<=0||B<=0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }
}


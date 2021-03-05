package starProxy;


public class staticProxy {

    public static void main(String[] args) {
        SuperStarDao superStarDao = new SuperStarDao();
        StarbrokerDaoProxy starbrokerDaoProxy = new StarbrokerDaoProxy(superStarDao);
        starbrokerDaoProxy.doWork();
    }
}




/** 声明接口，用户工作的接口
 *
 */
interface IStarDao {

   void doWork();
}

/**
 * 明星工作类 实现演戏
 */
 class SuperStarDao implements IStarDao{

    @Override
    public void doWork() {
        //进行演戏
        System.out.println("明星演戏");
    }
}




 /**
 *  经纪人代理类
 *  主要负责接活，安排明星工作，已经其他工作/
 */
 class StarbrokerDaoProxy implements IStarDao{
     private  IStarDao starDao;

     public  StarbrokerDaoProxy(IStarDao StarDao){
         this.starDao = StarDao;

     }

     @Override
     public void doWork() {
         //接活
         System.out.println("接活");
         starDao.doWork();//明星工作
         //宣传
         System.out.println("宣传");
     }
 }


import java.util.Arrays;
import java.util.Random;

public class Grid {

    public final boolean status[][];
    private final int width;
    private final int height;

    private Snake snake;
    private Node food;
    private boolean life = true;

    // 初始方向设置为向左
    private Direction snakeDirection = Direction.LEFT;

    public Grid(int width, int height) {  //初始化棋盘

        this.width = width;
        this.height = height;
        status = new boolean[width][height];

        init();
    }

    public void init() {  //初始化蛇的朝向
        for (int i = 0; i < width; ++i) {
            Arrays.fill(status[i], false);
        }

        snakeDirection = Direction.LEFT;
        initSnake();
        createFood();
    }

    /**
     * 初始化棋盘上的贪吃蛇
     *
     * @return
     */
    private Snake initSnake() { //初始化的贪吃蛇的长度不能过长 自己可以定义
        snake = new Snake();
        snake.getBody().add(new Node(10, 10));
        snake.getBody().add(new Node(11, 10));
        snake.getBody().add(new Node(12, 10));
        snake.getBody().add(new Node(13, 10));
        snake.getBody().add(new Node(14, 10));


        return this.snake;
    }

    /**
     * 随机产生一个食物（Node类型），并返回该Node
     *
     * @return
     */
    public Node createFood() {//创建的事务必须是在棋盘中...
        Random random = new Random();
        int x = random.nextInt(30);
        int y = random.nextInt(20);
        food = new Node(x, y);
        return food;
    }

    /**
     * 贪吃蛇往snakeDirection方向移动一格
     *
     * @return 如果游戏结束，返回false，否则返回true
     */
    public boolean nextRound() {
        //如果蛇的方向是左
        if (snakeDirection == Direction.LEFT) {
            //新建一个节点，位置是蛇头前方的那个节点的位置
            Node tempNode =
                    new Node(snake.getBody().getFirst().getX()-1, snake.getBody().getFirst().getY());

            if (validPosition(tempNode)&&isBody(tempNode)){
                //如果没吃到墙壁和自己身子，则判断前方节点是否是食物
                if(isFood(tempNode)){
                    //如果是食物，则将此节点添加到蛇身
                    snake.getBody().addFirst(tempNode);
                    //新建一个食物
                    food = createFood();
                }else{
                    //如果蛇头前方的节点不是食物，则将最后一个节点移除，在头部添加一个此节点
                    snake.getBody().removeLast();
                    snake.getBody().addFirst(tempNode);
                }
            }else{
                //如果蛇头吃到墙壁或者自己身子，则死亡，游戏结束
                this.life = false;
                return false;
            }

        }
        //方向向右，其余同理
        if (snakeDirection == Direction.RIGHT) {
            Node tempNode =
                    new Node(snake.getBody().getFirst().getX()+1, snake.getBody().getFirst().getY());
            if (validPosition(tempNode)&&isBody(tempNode)){
                if(isFood(tempNode)){
                    snake.getBody().addFirst(tempNode);
                    food = createFood();
                }else{
                    snake.getBody().removeLast();
                    snake.getBody().addFirst(tempNode);
                }
            }else{
                this.life = false;
                return false;
            }

        }
        //方向向上，其余同理
        if (snakeDirection == Direction.UP) {
            Node tempNode =
                    new Node(snake.getBody().getFirst().getX(), snake.getBody().getFirst().getY()-1);
            if (validPosition(tempNode)&&isBody(tempNode)){
                if(isFood(tempNode)){
                    snake.getBody().addFirst(tempNode);
                    food = createFood();
                }else{
                    snake.getBody().removeLast();
                    snake.getBody().addFirst(tempNode);
                }
            }else{
                this.life = false;
                return false;
            }
        }
        //方向向下，其余同理
        if (snakeDirection == Direction.DOWN) {
            Node tempNode =
                    new Node(snake.getBody().getFirst().getX(), snake.getBody().getFirst().getY()+1);
            if (validPosition(tempNode)&&isBody(tempNode)){
                if(isFood(tempNode)){
                    snake.getBody().addFirst(tempNode);
                    food = createFood();
                }else{
                    snake.getBody().removeLast();
                    snake.getBody().addFirst(tempNode);
                }

            }else{
                this.life = false;
                return false;
            }
        }



        return false;
    }

    public void changeDirection(Direction newDirection) {
        if (snakeDirection.compatibleWith(newDirection)) {
            snakeDirection = newDirection;
        }
    }

    public boolean validPosition(Node area) {
        int x = area.getX(), y = area.getY();
        return x >= 0 && x < width && y >= 0 && y < height && !status[x][y];
    }

    private void dispose(Node node) {
        status[node.getX()][node.getY()] = false;
    }

    private void occupy(Node node) {
        status[node.getX()][node.getY()] = true;
    }


    public boolean isFood(Node area) {
        int x = area.getX(), y = area.getY();
        return x == food.getX() && y == food.getY();
    }
    //判断蛇头吃的是否是自己的身子
    public boolean isBody(Node area){
        int x = area.getX(),y = area.getY();
        for (Node node : snake.getBody()) {
            if (node.getX()==x&&node.getY()==y){
                return false;
            }
        }
        return true;
    }
    //判断是否蛇已经死亡
    public boolean isDead(){
        return !life;
    }

    public Node getFood() {
        return food;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    //死亡后重置生命
    public void setLife(){
        life = true;
    }
}

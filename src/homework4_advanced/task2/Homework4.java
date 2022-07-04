package homework4_advanced.task2;

public class Homework4 {
    public static void main(String[] args) {
        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами)
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        Watch watchBroken = new Watch(true);
        Watch watch= new Watch(false);
        Worker worker = new Worker(watch);
        Worker workerWithBrokenWatch = new Worker(watchBroken);
        Worker[] workersForShop1 = {worker};
        Worker[] workersForShop2 = {workerWithBrokenWatch};
        Shop shop1 = new Shop(workersForShop1);
        Shop shop2 = new Shop(workersForShop2);
        Shop[] shops = new Shop[]{shop1, shop2};
        Brand brand = new Brand(shops);
        for (Shop shop : brand.getShops()) {
            for (Worker shopWorker : shop.getWorker()) {
                try {
                    shopWorker.getWatch().tick();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }

        }


    }
}

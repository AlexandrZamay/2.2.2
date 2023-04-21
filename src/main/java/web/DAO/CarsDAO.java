package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.List;

public interface CarsDAO {

    public List<Car> getCarList(Integer q);
   // public int getListSize();
 //   public List<Car> getCars();
}

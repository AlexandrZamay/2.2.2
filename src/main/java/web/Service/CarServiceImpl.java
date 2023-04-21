package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.Model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarsService {
    private final CarsDAO carsDAO;
    @Autowired
    public CarServiceImpl(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @Override
    public List<Car> getCarList(Integer q) {
      return carsDAO.getCarList(q);
    }
}

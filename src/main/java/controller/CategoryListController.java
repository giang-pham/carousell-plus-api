package controller;

import java.util.List;

import model.carousell.CarousellConstant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import service.IProductListService;

@RestController
public class CategoryListController {

	@Autowired
	IProductListService productListService;

	@SuppressWarnings("unchecked")
	@RequestMapping(path = "/categories", method = RequestMethod.GET)
	public ResponseEntity<List> getCategories() {
		return new ResponseEntity<List>(CarousellConstant.categoryList, HttpStatus.OK);
	}
}

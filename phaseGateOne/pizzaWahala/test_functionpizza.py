import unittest
import functionpizza

class TestPizzaAppFunction(unittest.TestCase):
	def test_that_get_orders_exist(self):
		functionpizza.get_orders(45, "odogwu")

	def test_that_get_orders_returns_correct_value(self):
		actual = functionpizza.get_orders(45, "odogwu")
		expected = "odogwu"
		self.assertEqual(actual, expected)
		
	def test_that_get_calculate_order_exist(self):
		functionpizza.get_calculate_order(45, "odogwu")
	

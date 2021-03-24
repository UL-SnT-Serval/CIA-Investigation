import unittest
from src.utils.list_utils import is_number_in_list
import csv


class TestListUtils(unittest.TestCase):

    def test_empty(self):
        self.assertFalse(is_number_in_list(0, []))

    def test_in_list(self):
        self.assertTrue(is_number_in_list(0, [49, 85, 0]))

    def test_not_in_list(self):
        self.assertFalse(is_number_in_list(42, [49, 85, 0]))

    def test_in_huge_list(self):
        f = open(".\\data\\tests\\test_in_huge_list.txt", "r")
        list_f = []
        for line in f:
            list_f += [int(line)]
        self.assertTrue(is_number_in_list(70, list_f))


if __name__ == '__main__':
    unittest.main()

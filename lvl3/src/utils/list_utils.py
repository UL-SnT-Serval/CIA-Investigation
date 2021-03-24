def is_number_in_list(number: int, input_list: list) -> bool:
    for i in input_list:
        if number == i:
            return True
    return False

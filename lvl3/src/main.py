from utils.list_utils import is_number_in_list


def main():
    number = 42
    list_a = [49, 85, 42]

    is_in_list = is_number_in_list(number, list_a)
    if is_in_list:
        print(f"Number {number} is in the list.")
    else:
        print(f"Number {number} is not in the list.")


if __name__ == '__main__':
    main()
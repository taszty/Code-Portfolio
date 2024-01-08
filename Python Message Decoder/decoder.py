# define function 
def decode(message_file):
    # read input content
    with open(message_file, 'coding_qual_input') as file:
        lines = file.readlines()
    # extract the numbers used for the code into their own list
    numbers = [int(line.split()[0]) for line in lines]
    # extract words according to their corresponding number from the previous list
    decoded_words = [line.split()[1] for i, line in enumerate(lines) if i + 1 in numbers]
    # join the words into a decoded string
    decoded_message = ' '.join(decoded_words)
    # output decoded string
    return decoded_message

# example using referenced file
message_file_path = 'coding_qual_input.txt'
decoded_message = decode(message_file_path)
# output decoded message
print(decoded_message)

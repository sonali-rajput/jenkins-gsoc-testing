#open text file in read mode
text_file = open("./logs.txt", "r")

#read whole file to a string
data = text_file.read()

#close file
text_file.close()


if data.find('failed to start containerd: timeout waiting for containerd to start') != -1:
    raise Exception("failed to start containerd: timeout waiting for containerd to start")
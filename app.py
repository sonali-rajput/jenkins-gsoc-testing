#open text file in read mode
#text_file = open("./logs.txt", "r")
import subprocess
result = subprocess.run(['docker','compose','logs'], stdout=subprocess.PIPE)
data = result.stdout
#read whole file to a string
#data = text_file.read()
print(data)
#close file
text_file.close()


if data.find('failed to start containerd: timeout waiting for containerd to start') != -1:
    raise Exception("failed to start containerd: timeout waiting for containerd to start")

raise Exception("error for testing")
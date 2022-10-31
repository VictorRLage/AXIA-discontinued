import time
import subprocess

while True:

    # CAPTURA SERIAL ID PC CMD
    
    print("com a função check_output() a gente captura qual a resposta pro comando executado dentro do () e atribuÍmos a uma var (direct_output2)")
    direct_output2 = subprocess.check_output(
        'wmic bios get serialnumber', shell=True)
    print(direct_output2)
    print()
    print("com a função decode a gente transforma os dados da var direct_output2 de bytes para string para podermos tratar esse dado")
    SerialID = direct_output2.decode('UTF-8')
    print(SerialID)
    print()
    print("utilizando a função strip() a gente retira os espaços desnesesarios")
    trim1SerialID = SerialID.strip()
    print(trim1SerialID)
    print()
    print("então criamos uma nova função para remover as linhas e utilizamos ela")
    def func(value):
        return ''.join(value.splitlines())
    trim2SerialID = func(trim1SerialID)
    print(trim2SerialID)
    print()
    print("removemos o tÍtulo do dado, pois ele não vai para o banco")
    trim3SerialID = trim2SerialID.strip("SerialNumber")
    print(trim3SerialID)
    print()
    print("então removemos novamente os espaços desnecessários")
    trim4SerialID = trim3SerialID.strip()
    print(trim4SerialID)
    print()
    print()
    print()
    time.sleep(10)

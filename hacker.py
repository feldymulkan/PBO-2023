import socket

soc = socket.socket()
soc.bind(('192.168.1.16', 9999)) #binding ip target
print('Menunggu Koneksi...') # Listener
soc.listen(1) #Jumlah target bisa 2 bisa 3

koneksi = soc.accept()
_target = koneksi[0]
ip = koneksi[1]
print(_target)
print(f'Terhubung ke {str(ip)}')



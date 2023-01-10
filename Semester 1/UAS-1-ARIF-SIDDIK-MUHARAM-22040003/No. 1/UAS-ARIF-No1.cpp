/*
Nama : Arif Siddik Muharam 
NIM : 220040003 
Fakultas Ilmu Komputer - Teknik Informatika - Semester 1 
UAS - Struktur Data 
*/
// Program Enkripsi dan Dekripsi Teks menggunakan Algoritma Caesar Cipher
#include <iostream>
#include <string.h>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void enkripsi(){
 //string K; 
 string plainteks, cipherteks;
 int i, k;
 char c;
 
 cout<< "Ketikkan Teks : ";
 cin.ignore(); 
 getline(cin,plainteks);
 cout<< "Masukkan Jumlah Pergeseran (0-25): ";
 cin >> k;
 
 for(i =0; i<plainteks.length(); i++){
  c = plainteks[i];
  if(isalpha(c)){
   c= toupper(c);
   c=c-65;
   c=(c+k)%26;
   c=c+65;
  }
  cipherteks=cipherteks+c;
 } 
 cout<<"Cipherteks: "<< cipherteks<<endl;
  cout << " " << endl;
}

void dekripsi(){
 string plainteks, cipherteks;
 int i, k;
 char c;

 cout<< "Ketikkan Cipherteks: "; 
 cin.ignore();
 getline(cin, cipherteks);
 
 cout << "Masukkan Jumlah Pergeseran (0-25): ";
 cin >>k;
 
 for(i=0;i<cipherteks.length() ; i++){
  c= cipherteks[i];
  if(isalpha(c)){
   c= toupper(c);
   c= c-65;
   if(c-k<0){
    c=26+(c-k);
   }else{
    c=(c-k)%26;
    c=c+65;
    c= tolower(c);
   }
   plainteks=plainteks+c;
  }
  cout<< "Plainteks: " << plainteks<<endl;
 }
}

int main() {
 int pil; bool stop;
 stop = false ;
 while(!stop){ 
  cout<<"--------------"<<endl;
  cout << "Menu " << endl;
  cout<<"--------------"<<endl;
  cout << "1. Enkripsi " << endl;
  cout << "2. Dekripsi " << endl;
  cout << "3. Exit " << endl;
  cout << "Pilih Menu "; cin>> pil;
  cout << " " << endl;
  switch(pil){
   case 1: enkripsi();break;
   case 2: dekripsi(); break;
   case 3: stop=true; break;
  }
 }
}


/*
Nama : Arif Siddik Muharam 
NIM : 220040003 
Fakultas Ilmu Komputer - Teknik Informatika - Semester 1 
UAS - Struktur Data 
*/
#include <iostream>
#include <string>
using namespace std;
 
struct Course{
  string courseid;
  string name;
  int duration;
  double fee;
  string prerequisite;
  string description;
};
struct Room{
  string roomid;
  string name;
  string description;
};
struct Address{
  string street;
  string city;
  string state;
  string province;
  string zipcode;
};
struct Trainer{
  string trainerid; 
  string name; 
  string address;
  string telephone;
  string email;
};
struct Schedule{
  string scheduleid;
  string courseid;
  string roomid;
  string trainerid;  
  string date;   
  int capacity;
};
 
int main() {


    cout<<"--------------"<<endl;
    cout<<"Data Mahasiswa"<<endl;
    cout<<"--------------"<<endl;
    cout<<"Nama          : Arif Siddik Muharam"<<endl;
    cout<<"NIM           : 220040003"<<endl;
    cout<<"Fakultas Ilmu Komputer - Teknik Informatika - Semester 1"<<endl;
    cout<<"UAS - Struktur Data"<<endl;
    cout<<""<<endl; 
 
    Course Course;
    Course.courseid="1"; 
    Course.name="Belajar Struktur Data C++";
    Course.duration=60;
    Course.fee=50000;
    Course.prerequisite="Komputer";
    Course.description="-";
    cout<<"--------------"<<endl;
    cout<<"Data Course"<<endl;
    cout<<"--------------"<<endl;
    cout<<"ID           : "<<Course.courseid<<endl;
    cout<<"Nama         : "<<Course.name<<endl;
    cout<<"Durasi       : "<<Course.duration<<endl;
    cout<<"Biaya        : "<<Course.fee<<endl;
    cout<<"Kebutuhan    : "<<Course.prerequisite<<endl;
    cout<<"Deskripsi    : "<<Course.description<<endl;

    cout<<" "<<endl;

    Room Room;
    Room.roomid="1"; 
    Room.name="Lab Komputer 1";
    Room.description="-";
    cout<<"--------------"<<endl;
    cout<<"Data Room"<<endl;
    cout<<"--------------"<<endl; 
    cout<<"ID           : "<<Room.roomid<<endl;
    cout<<"Nama Ruangan : "<<Room.name<<endl;
    cout<<"Deskripsi    : "<<Room.description<<endl;
      
    cout<<" "<<endl;

    Address Address;
    Address.street="Citankil"; 
    Address.city="Cilegon"; 
    Address.state="Cilegon"; 
    Address.province="Banten"; 
    Address.zipcode="42441"; 
    cout<<"--------------"<<endl;
    cout<<"Data Address"<<endl;
    cout<<"--------------"<<endl; 
    cout<<"Street       : "<<Address.street<<endl;
    cout<<"City         : "<<Address.city<<endl;
    cout<<"State        : "<<Address.state<<endl;
    cout<<"Province     : "<<Address.province<<endl;
    cout<<"Zipcode      : "<<Address.zipcode<<endl;
      
    cout<<" "<<endl;

    Trainer Trainer;
    Trainer.trainerid="1"; 
    Trainer.name="Teuku Fadjar Shadek"; 
    Trainer.address="-"; 
    Trainer.telephone="0"; 
    Trainer.email="-";
    cout<<"--------------"<<endl;
    cout<<"Data Trainer"<<endl;
    cout<<"--------------"<<endl;
    cout<<"ID           : "<<Trainer.trainerid<<endl;
    cout<<"Nama         : "<<Trainer.name<<endl;
    cout<<"Address      : "<<Trainer.address<<endl;
    cout<<"Telephone    : "<<Trainer.telephone<<endl;
    cout<<"Email        : "<<Trainer.email<<endl;
      
    cout<<" "<<endl;

    Schedule Schedule;
    Schedule.scheduleid="1"; 
    Schedule.courseid="1"; 
    Schedule.roomid="1"; 
    Schedule.trainerid="1";   
    Schedule.date="Senin, 09 Januari 2023"; 
    Schedule.capacity=20;  
    cout<<"--------------"<<endl;
    cout<<"Data Schedule"<<endl;
    cout<<"--------------"<<endl; 
    cout<<"ID Schedule  : "<<Schedule.scheduleid<<endl;
    cout<<"ID Course    : "<<Schedule.courseid<<endl;
    cout<<"ID Room      : "<<Schedule.roomid<<endl;
    cout<<"ID Trainer   : "<<Schedule.trainerid<<endl;
    cout<<"Tanggal      : "<<Schedule.date<<endl;
    cout<<"Kapasitas    : "<<Schedule.capacity<<endl;

    return 0;
}

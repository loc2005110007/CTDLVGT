package ThiCuoiKi;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Kho {
    DoDaDung headDoDaDung ;
    ThucPham headThucPham;
    PhuongTien headPhuongTien;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    Kho(){}

    Kho(PhuongTien _headPhuongTien ,DoDaDung _headDoDaDung, ThucPham _headThucPham){
        headPhuongTien = _headPhuongTien ;
        headDoDaDung = _headDoDaDung ;
        headThucPham = _headThucPham ;
    }
    
    public void add(Scanner input){
        System.out.println("ban muon them mat hang nao?");
		System.out.print("1) PhuongTien");
        System.out.println("2) Do Da Dung");
        System.out.println("3) ThucPham");
        System.out.print("Nhap Lua Chon: ");
		int chose  = input.nextInt();
        if(chose <= 3){
        
        if(chose == 1){
            PhuongTien currentPhuongTien = headPhuongTien ;
            while(currentPhuongTien != null){
                if (currentPhuongTien.next == null){
                    PhuongTien KhoNew = new PhuongTien() ;
                    KhoNew.id = NhapId(input, chose);
                    KhoNew.nhapThongTin(input);
                    currentPhuongTien.next = KhoNew ;
                    break ;
                }
                currentPhuongTien = currentPhuongTien.next;
            }
        }
        
        if(chose == 2){
            DoDaDung currentDoDaDung = headDoDaDung ;
            while(currentDoDaDung != null){
                if(currentDoDaDung.next == null){
                    DoDaDung KhoNew = new DoDaDung() ;
                    KhoNew.id = NhapId(input, chose);
                    KhoNew.nhapThongTin(input);
                    currentDoDaDung.next = KhoNew ;
                    break ;
                }
                currentDoDaDung = currentDoDaDung.next;
            }
        }

        if(chose == 3){
            ThucPham currentThucPham = headThucPham ;
            while(currentThucPham != null){
                if(currentThucPham.next == null){
                    ThucPham KhoNew = new ThucPham() ;
                    KhoNew.id = NhapId(input, chose);
                    KhoNew.nhapThongTin(input);
                    currentThucPham.next = KhoNew ;
                    break ;
                }
                currentThucPham = currentThucPham.next;
            }
        }
        }else 
             System.out.println("Ban da chon sai!!!");

    }

    public int NhapId(Scanner input , int chose){
        System.out.print("hay nhap id san pham: ");
		int id = input.nextInt();

        if(chose == 1){
            PhuongTien current = headPhuongTien ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id nay da ton tai!!!");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 2){
            DoDaDung current = headDoDaDung ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id nay da ton tai!!!");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 3){
            ThucPham current = headThucPham ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id nay da ton tai!!!");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        return id ;
    }

    public void inThongTin(){
        DoDaDung currentDoDaDung = headDoDaDung;
        ThucPham currentThucPham = headThucPham ;
        PhuongTien currentPhuongTien = headPhuongTien ;

        while(currentPhuongTien != null){
            currentPhuongTien.inThongTin();
            currentPhuongTien=currentPhuongTien.next;
        }

        System.out.println();

        while(currentDoDaDung != null ){
            currentDoDaDung.inThongTin();
            currentDoDaDung =currentDoDaDung.next;
        }

        System.out.println();

        while(currentThucPham != null){
            currentThucPham.inThongTin();
            currentThucPham = currentThucPham.next ;
        }

    }

    public void delecte(Scanner input){
        System.out.println("Ban Xoa theo phuong thuc nao ???");
		System.out.print("1) Theo Id: ");
		System.out.println("2) Theo ten:");
        System.out.println("3) Theo gia ");
        System.out.println(" ==>Lua chon:");
		int chose = input.nextInt();

        if (chose == 1) {
            System.out.print("Nhap Id hang can xoa");
			int idCanXoa = input.nextInt();

            if (headPhuongTien.id == idCanXoa) {
                headPhuongTien = headPhuongTien.next ;
                return ;
            }

            if (headDoDaDung.id == idCanXoa) {
                headDoDaDung = headDoDaDung.next ;
                return;
            }

            if (headThucPham.id == idCanXoa) {
                headThucPham = headThucPham.next ;
                return;
            }

            PhuongTien curentPhuongTien = headPhuongTien ;
            DoDaDung currentDoDaDung = headDoDaDung ;
            ThucPham currentThucPham = headThucPham ;

            while ( curentPhuongTien.next != null){
                if (curentPhuongTien.next.id == idCanXoa) {
                    curentPhuongTien.next = curentPhuongTien.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                curentPhuongTien = curentPhuongTien.next ;
            }

            while ( currentDoDaDung.next != null){
                if (currentDoDaDung.next.id == idCanXoa) {
                    currentDoDaDung.next = currentDoDaDung.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentDoDaDung = currentDoDaDung.next ;
            }

            while ( currentThucPham.next != null){
                if (currentThucPham.next.id == idCanXoa) {
                    currentThucPham.next = currentThucPham.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentThucPham = currentThucPham.next ;
            }
            System.out.println("Khong Tim Thay ID.");
        }

        if (chose == 2 ) {
            System.out.print("Hay nhap ten hang can xoa: ");
			input.nextLine();
			String tenCanXoa = input.nextLine();

            if (headPhuongTien.ten.equalsIgnoreCase(tenCanXoa)) {
                headPhuongTien = headPhuongTien.next;
                return;
            }

            if (headDoDaDung.ten.equalsIgnoreCase(tenCanXoa)) {
                headDoDaDung = headDoDaDung.next;
                return;
            }

            if (headThucPham.ten.equalsIgnoreCase(tenCanXoa)) {
                headThucPham = headThucPham.next;
                return;
            }

            PhuongTien currentPhuongTien = headPhuongTien ;
            DoDaDung currentDoDaDung = headDoDaDung;
            ThucPham currentThucPham = headThucPham ;

            while (currentPhuongTien.next != null) {
                if (currentPhuongTien.next.ten.equalsIgnoreCase(tenCanXoa)) {
                    currentPhuongTien.next =currentPhuongTien.next.next ;
                    System.out.println("Xoa thanh cong");
                    return ;
                }
                currentPhuongTien = currentPhuongTien.next ;
            }

            while (currentDoDaDung.next != null) {
                if (currentDoDaDung.next.ten.equalsIgnoreCase(tenCanXoa)) {
                    currentDoDaDung.next =currentDoDaDung.next.next ;
                    System.out.println("Xoa thanh cong");
                    return ; 
                }
                currentDoDaDung = currentDoDaDung.next ;
            }

            while (currentThucPham.next != null) {
                if (currentThucPham.next.ten.equalsIgnoreCase(tenCanXoa)) {
                    currentThucPham.next =currentThucPham.next.next ;
                    System.out.println("Successful delete.");
                    return ;
                }
                currentThucPham = currentThucPham.next ;
            }
            System.out.println("Khong Tim Thay Ten");
        }
           
        if (chose == 3) {
            System.out.print("Nhap Gia Hang Can Xoa");
			int giaCanXoa = input.nextInt();

            if (headPhuongTien.gia == giaCanXoa) {
                headPhuongTien = headPhuongTien.next ;
                return ;
            }

            if (headDoDaDung.gia == giaCanXoa) {
                headDoDaDung = headDoDaDung.next ;
                return;
            }

            if (headThucPham.gia == giaCanXoa) {
                headThucPham = headThucPham.next ;
                return;
            }

            PhuongTien curentPhuongTien = headPhuongTien ;
            DoDaDung currentDoDaDung = headDoDaDung ;
            ThucPham currentThucPham = headThucPham ;

            while ( curentPhuongTien.next != null){
                if (curentPhuongTien.next.gia == giaCanXoa) {
                    curentPhuongTien.next = curentPhuongTien.next.next;
                    System.out.println("Xoa thanh cong");
                    return;
                }
                curentPhuongTien = curentPhuongTien.next ;
            }

            while ( currentDoDaDung.next != null){
                if (currentDoDaDung.next.gia == giaCanXoa) {
                    currentDoDaDung.next = currentDoDaDung.next.next;
                    System.out.println("Xoa thanh cong");
                    return;
                }
                currentDoDaDung = currentDoDaDung.next ;
            }

            while ( currentThucPham.next != null){
                if (currentThucPham.next.gia == giaCanXoa) {
                    currentThucPham.next = currentThucPham.next.next;
                    System.out.println("Xoa thanh cong");
                    return;
                }
                currentThucPham = currentThucPham.next ;
            }
            System.out.println("khong tim Thay Gia");
        }
    }
    
    public void timHangTheoLoai(Scanner input){
        System.out.println("\nHay Nhap Loai Hang Ban Muon Tim");
        System.out.print("1) ??i???n m??y	2) S??nh s???	3) Th???c ph???m ----> L???a ch???n: ");
        int loaiHang = input.nextInt();

        if (loaiHang == 1) {
            PhuongTien cur = headPhuongTien;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }else if (loaiHang == 2) {
            DoDaDung cur = headDoDaDung;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }else if (loaiHang == 3) {
            ThucPham cur = headThucPham;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }
    }

    public void timHangTheoGia(Scanner input){
        System.out.print("H??y nh???p kho???ng gi?? c???a h??ng b???n mu???n t??m\nT???: ");
			float start = input.nextFloat();
			System.out.print("?????n: ");
			float end = input.nextFloat();
			
			PhuongTien currentPhuongTien = headPhuongTien;
			DoDaDung currentDoDaDung = headDoDaDung;
			ThucPham currentThucPham = headThucPham;
			
			while (currentPhuongTien != null) {
				if (currentPhuongTien.gia >= start && currentPhuongTien.gia <= end)
					currentPhuongTien.inThongTin();
				currentPhuongTien = currentPhuongTien.next;
			}
			System.out.println();
			
			while (currentDoDaDung != null) {
				if (currentDoDaDung.gia >= start && currentDoDaDung.gia <= end)
					currentDoDaDung.inThongTin();
				currentDoDaDung = currentDoDaDung.next;
			}
			System.out.println();
			
			while (currentThucPham != null) {
				if (currentThucPham.gia >= start && currentThucPham.gia <= end)
					currentThucPham.inThongTin();
				currentThucPham = currentThucPham.next;
			}
    }

    public void timHangtheoNgay(Scanner input){
        System.out.println("Nhap Khoang Ngay Nhap Kho San Pham (dd-MM-yyyy)\nTu Ngay: ");
			input.nextLine();
			String date = input.nextLine();
			
			int count = 0;
			
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("B???n ???? nh???p sai m???u ng??y h??y ch???n (T??m h??ng ??? Menu v?? thao t??c l???i)");
				return;
			}
			
			System.out.println("?????n ng??y: ");
			String date1 = input.nextLine();
			Date endDate;
			try {
				endDate = dateFormat.parse(date1);
			} catch (ParseException e) {
				System.err.println("B???n ???? nh???p sai m???u ng??y h??y ch???n (T??m h??ng ??? Menu v?? thao t??c l???i)");
				return;
			}
			
			PhuongTien curDM = headPhuongTien;
			while (curDM != null) {
				if (curDM.date.compareTo(startDate) >= 0 && curDM.date.compareTo(endDate) <= 0) {
					count++;
					curDM.inThongTin();
				}
				
				
				curDM = curDM.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			DoDaDung curSS = headDoDaDung;
			while (curSS != null) {
				if (curSS.date.compareTo(startDate) >= 0 && curSS.date.compareTo(endDate) <= 0) {
					count++;
					curSS.inThongTin();
				}
				
				curSS = curSS.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			ThucPham curTP = headThucPham;
			while (curTP != null) {
				if (curTP.date.compareTo(startDate) >= 0 && curTP.date.compareTo(endDate) <= 0) {
					count++;
					curTP.inThongTin();
				}
				
				curTP = curTP.next;
			}
	}
    
    public void thongKe(Scanner input){
        int tongSLHang;
		int tongSLPhuongTien = 0;
		int tongSLDoDaDung = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriPhuongTien = 0;
		float tongGiaTriDoDaDung = 0;
		float tongGiaTriThucPham = 0;
		
		PhuongTien currentPhuongTien = headPhuongTien;
		DoDaDung currentDoDaDung = headDoDaDung;
		ThucPham currentThucPham = headThucPham;
		
		while (currentPhuongTien != null) {
			tongSLPhuongTien++;
			tongGiaTriPhuongTien += currentPhuongTien.gia;
			currentPhuongTien = currentPhuongTien.next;
		}
		
		while (currentDoDaDung != null) {
			tongSLDoDaDung++;
			tongGiaTriDoDaDung += currentDoDaDung.gia;
			currentDoDaDung = currentDoDaDung.next;
		}
		
		while (currentThucPham != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += currentThucPham.gia;
			currentThucPham = currentThucPham.next;
		}
		
		tongSLHang = tongSLPhuongTien + tongSLDoDaDung + tongSLThucPham; 
		tongGiaTri = tongGiaTriPhuongTien + tongGiaTriDoDaDung + tongGiaTriThucPham;
		
        System.out.println("Total quantity of goods in stock is : "+tongSLHang+ " products.");
        System.out.println("Total value of inventory is: "+tongGiaTri+" VND.\n");

        System.out.println("Electronics there are: " +tongSLPhuongTien+" products.");
        System.out.println("Crockery there are: "+tongSLDoDaDung+" products.");
        System.out.println("ThucPham there are: "+tongSLThucPham+" products.");
		
    }

    public void sortUpgia(){

    }
    public void fixByType(Scanner input){
        System.out.print("Enter the id of the item you want to fix: "); 
        int id = input.nextInt();
			PhuongTien currentPhuongTien = headPhuongTien;
			DoDaDung currentDoDaDung = headDoDaDung;
			ThucPham currentThucPham = headThucPham;
			
			while (currentPhuongTien != null) {
				if (currentPhuongTien.id == id) {
					currentPhuongTien.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product ten: "); input.nextLine(); currentPhuongTien.ten = input.nextLine();
					System.out.print("ID: ");	currentPhuongTien.id = input.nextInt();
					System.out.print("Product gia: "); currentPhuongTien.gia = input.nextFloat();
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentPhuongTien.date = b;
                    System.out.println("---Successful repair");
					return;
				}
				currentPhuongTien = currentPhuongTien.next;
			}
			
			while (currentDoDaDung != null) {
				if (currentDoDaDung.id == id) {
					currentDoDaDung.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product ten: "); input.nextLine(); currentDoDaDung.ten = input.nextLine();
					System.out.print("ID: ");	currentDoDaDung.id = input.nextInt();
					System.out.print("Product gia: "); currentDoDaDung.gia = input.nextFloat();
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentDoDaDung.date = b;
                    System.out.println("---Successful repair");
					return;
				}
				currentDoDaDung = currentDoDaDung.next;
			}
			
			while (currentThucPham != null) {
				if (currentThucPham.id == id) {
					currentThucPham.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product ten: "); input.nextLine(); currentThucPham.ten = input.nextLine();
					System.out.print("ID: ");	currentThucPham.id = input.nextInt();
					System.out.print("Product gia: "); currentThucPham.gia = input.nextFloat();
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentThucPham.date= b;
                    System.out.println("---Successful repair");
					return;
				}
				currentThucPham = currentThucPham.next;
			}
    }
}


    



    



    


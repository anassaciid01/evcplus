import java.util.Scanner;

public class EVCPLUS1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPIN = 1010;
        double haraaga = 500.00;
        System.out.print("Fadlan geli *770#: ");
        String code = input.nextLine();

        if (code.equals("*770#")) {

        } else {
            System.out.println("Code khaldan!");
        }


        System.out.println("<-EVCPlus->");

        System.out.print("Fadlan geli PIN-kaaga");
        int pin = input.nextInt();

        if (pin != 1010) {
            System.out.println("-EVCPLUS- Nambarka Sirta ah waa Khalad");
            return;
        }


        System.out.println("EVCPus");
        System.out.println("1. Itus Haraaga");
        System.out.println("2. Kaarka hadalka");
        System.out.println("3. Bixi Biil");
        System.out.println("4. U wareeji EVCPlus");
        System.out.println("5. Warbixin Kooban");
        System.out.println("6. Salaam Bank");
        System.out.println("7. Maareynta");
        System.out.println("8. Bill Payment");
        System.out.println("9. ka bixid ");


        int choice = input.nextInt();
        input.nextLine();
    if (choice==0){
        System.out.println("finish");
    }

        switch (choice) {
            case 1:
                //1.Qeybta Haraga
                System.out.println("EVCPlus");
                System.out.println("Itus Haraaga");
                System.out.println(" Haraaga waa $400.00");
                break;


            case 2:
                //2.Qeybta Karka hadalka
                System.out.println("EVCPlus");
                System.out.println(" Kaarka hadalka");
                System.out.println("1. ku shubo Airtime");
                System.out.println("2. ugu shub airtime");
                System.out.println("3. mifi packages");
                System.out.println("4. ku shubo internet");
                System.out.println("5. ugu shubo  qof kale ");
                System.out.print("Dooro: ");
                int kaarkaOption = input.nextInt();

                switch (kaarkaOption) {
                    case 1:
                        System.out.print("Gali lacagta aad rabto inaad ku shubato: ");
                        double lacagta = input.nextDouble();


                        System.out.println("Ma hubtaa inaad $" + lacagta + " ku shubato?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int submit1 = input.nextInt();

                        if (submit1 == 1) {
                            System.out.println("fadlan geli pin kaaga");
                            correctPIN = input.nextInt();
                            System.out.println("Waad ku guuleysatay inaad $" + lacagta + " ku shubato.");
                        } else
                            System.out.println(" Waanu ka xunahayn Kumaadan guuleysan inad ku shubato.");

                        if (lacagta > haraaga) {
                            System.out.println("Haraag kugu filan ma haysid.");
                        } else {
                            haraaga -= lacagta;
                            System.out.println("Waad ku shubatay Airtime $" + lacagta);
                            System.out.println("Haraagaaga cusub waa: $" + haraaga);
                        }
                        break;

                    case 2:
                        System.out.print("Gali lambarka aad ugu shubayso: ");
                        String lambarkaQaataha = input.next();
                        System.out.print("Gali lacagta aad ugu shubayso: ");
                        double lacagtaUguShubanaysa = input.nextDouble();
                        System.out.println("Ma hubtaa inaad $" + lacagtaUguShubanaysa + " ugu shubto numberkan " + lambarkaQaataha + "?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int submit2 = input.nextInt();
                        if (submit2 == 1) {
                            System.out.println("Waad ku guuleysaty howshaan");

                        } else {
                            System.out.println(" Waanu ka xunahayn Kumaadan guuleysan inad ugu shubto.");
                        }
                        if (lacagtaUguShubanaysa > haraaga) {
                            System.out.println(" Haraag kugu filan ma haysid.");
                        } else {
                            haraaga -= lacagtaUguShubanaysa;
                            System.out.println("Waxad ugu shubtay $" + lacagtaUguShubanaysa + " lambarka: " + lambarkaQaataha);
                            System.out.println("Haraagaaga cusub waa: $" + haraaga);
                        }
                        break;

                    case 3:
                        System.out.println(" MIFI Packages");
                        System.out.println("1. 5GB - $5");
                        System.out.println("2. 10GB - $9");
                        System.out.println("3. 20GB - $17");
                        System.out.print("Dooro xirmada: ");
                        int xirmoDoorasho = input.nextInt();
                        double qiimahaXirmada = 0;

                        switch (xirmoDoorasho) {
                            case 1:
                                System.out.println("Isbuucle");
                                System.out.println("Fadlan Dooro bundle");
                                System.out.println("1. $5 = 10GB");
                                System.out.println("2. $10 = 25GB");

                                int Xirmo1 = input.nextInt();
                                if (Xirmo1 == 1)
                                    System.out.println("$5=10GB");
                                else if (Xirmo1 == 2) {
                                    System.out.println("$10=25GB");

                                }
                                System.out.println("Fadlan gali MIFI user");
                                int mobile1 = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + Xirmo1 + "ugu shubtid" + mobile1);
                                System.out.println("1.Haa");
                                System.out.println("1.Maya");
                                int submit3_1 = input.nextInt();
                                if (submit3_1 == 1) {
                                    System.out.println("waad ku guuleystay inaad $" + Xirmo1 + "ugu shubtid" + mobile1);
                                } else {
                                    System.out.println("waanu ka xunahy kuma aadan guuleysan inaad$" + Xirmo1 + "ugu shubto" + mobile1);
                                }
                                break;
                            case 2:
                                System.out.println("Maalinle ");
                                System.out.println("Fadlan dooro Xirmada");
                                System.out.println("1. $1 = 2GB");
                                System.out.println("2. $2 = 5GB");

                                int Xirmo2 = input.nextInt();
                                if (Xirmo2 == 1)
                                    System.out.println("$1=2GB");
                                else if (Xirmo2 == 2) {
                                    System.out.println("$2=5GB");
                                }
                                System.out.println("Fadlan gali MIFI user");
                                int mobile2 = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + Xirmo2 + "=2GB " + "ugu shubtid" + mobile2);
                                System.out.println("1.Haa");
                                System.out.println("1.Maya");
                                int submit3_2 = input.nextInt();
                                if (submit3_2 == 1) {
                                    System.out.println("waad ku guuleystay inaad $" + Xirmo2 + "ugu shubtid" + mobile2);
                                } else {
                                    System.out.println("waanu ka xunahy kuma aadan guuleysan inaad$" + Xirmo2 + "ugu shubto" + mobile2);
                                }
                                break;
                            case 3:
                                System.out.println("Bille");
                                System.out.println("Fadlan dooro Bundle ka");
                                System.out.println("1.$20=40GB\n2.$40=80GB\n3.$60=150GB\n4.$25=Monthly unlimit");
                                int Xirmo3 = input.nextInt();
                                if (Xirmo3 == 1)
                                    System.out.println("$20=40GB");
                                else if (Xirmo3 == 2) {
                                    System.out.println("$40=80GB");

                                } else if (Xirmo3 == 3) {
                                    System.out.println("$60=150GB");
                                } else if (Xirmo3 == 4) {
                                    System.out.println("$25=Monthly unlimit");
                                }
                                System.out.println("Fadlan gali MIFI user");
                                int mobile3 = input.nextInt();
                                System.out.println("Ma hubtaa inaad $" + Xirmo3 + "ugu shubeysid" + mobile3);
                                System.out.println("1.Haa");
                                System.out.println("1.Maya");
                                int submit3_3 = input.nextInt();
                                if (submit3_3 == 1) {
                                    System.out.println("waad ku guuleystay inaad $" + Xirmo3 + "ugu shubtid" + mobile3);
                                } else
                                    System.out.println("waanu ka xunahy kuma aadan guuleysan inaad$" + Xirmo3 + "ugu shubto" + mobile3);
                        }
                        break;

                    case 4:
                        //internet
                        System.out.println("Ku shubo internet");
                        System.out.println("Fadlan dooro numberka ku shubaneysid");
                        System.out.println("1.Isbuucle\n2.Xirmo waqti ku xiran\n3.Data\n" + "4.Maalinle\n5.Bille");
                        int Xirmo4 = input.nextInt();
                        if (Xirmo4 == 1) {
                            System.out.println("Fadlan gali lacagta");
                            double lacag = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + lacag + "ugu shubeysid");
                            System.out.println("1.Haa\n2.Maya");
                            int submit4 = input.nextInt();
                            if (submit4 == 1) {
                                System.out.println("waad ku guuleystay inaad $" + lacag + "ugu shubtid");
                            } else
                                System.out.println("Kuma aadan guuleysan inaad $" + lacag + "ugu shubtid");

                        } else if (Xirmo4 == 2) {
                            System.out.println("Fadlan gali lacagta");
                            double lacag2 = input.nextDouble();
                            System.out.println("Ma hubtaa inaad $" + lacag2 + "ku shubtid oo time based package ah");
                            System.out.println("1.Haa\n2.Maya");
                            int submit4 = input.nextInt();
                            if (submit4 == 1) {
                                System.out.println("waad ku guuleystay inaad $" + lacag2 + "ku shubtid oo time based package ah");
                            } else {
                                System.out.println("Kuma aadan guuleysan inaad $" + lacag2 + "ugu shubtid");
                            }


                        } else if (Xirmo4 == 3) {
                            System.out.println("Data");
                            System.out.println("Fadlan geli Lacagta");
                            int Lacagta_Data = input.nextInt();
                            System.out.println("Ma hubtaa inaad $" + Lacagta_Data + " ku shubatid (1. yes 2. No)");
                            int Lacagta_Data_YesOrNo = input.nextInt();
                            if (Lacagta_Data_YesOrNo == 1) {
                                System.out.println("Waxadd ku guuleysatay inaad ku shubato $" + Lacagta_Data + " oo Data ah");
                            } else {
                                System.out.println("Kuma aadan guuleysan inaad ku shubato $" + Lacagta_Data + " oo Data ah");
                            }
                        } else if (Xirmo4 == 4) {
                            System.out.println("Maalinle");
                            System.out.println("Fadlan geli Lacagta");
                            int Lacagta_Maalinle = input.nextInt();
                            System.out.println("Ma hubtaa inaad $" + Lacagta_Maalinle + " ku shubatid (1. yes 2. No)");
                            int Maalinle_YesOrNo = input.nextInt();
                            if (Maalinle_YesOrNo == 1) {
                                System.out.println("Waxaad ku guuleysatay inaad ku shubato $" + Lacagta_Maalinle + " oo Maalintii dhan ah");
                            } else {
                                System.out.println("kuma aadan guuleysan inaad ku shubato $" + Lacagta_Maalinle + " oo Maalintii dhan ah");
                            }
                        } else if (Xirmo4 == 5) {
                            System.out.println("Bille ");
                            System.out.println("Fadlan geli Lacagta");
                            int Bille = input.nextInt();
                            System.out.println("Ma hubtaa inaad $" + Bille + " ku shubatid (1. yes 2. No)");
                            int Bille_HaaOrMaya = input.nextInt();
                            if (Bille_HaaOrMaya == 1) {
                                System.out.println("Waxaad ku guuleysatay inaad ku shubato $" + Bille + " oo Bishii dhan  ah");
                            } else {
                                System.out.println("kuma aadan guuleysan inaad ku  shubato $" + Bille + " oo Bishii dhan  ah");
                            }

                        } else {
                            System.out.println("Numberka aad dooratay maahan mid jira fadlan dooro number jira.");
                        }


                        double lacagtaInternetka = input.nextDouble();
                        if (lacagtaInternetka > haraaga) {
                            System.out.println(" Haraag xisabtada kuguma filana.");
                        } else {
                            haraaga -= lacagtaInternetka;
                            System.out.println("Waxad ku shubatay Internet $" + lacagtaInternetka);
                            System.out.println("Haraagaaga cusub waa: $" + haraaga);
                        }
                        break;

                    case 5:
                        System.out.println(" Ugu Shub qof kale (MMT)");
                        System.out.print("Gali lambarka qofka aad ugu shubayso: ");
                        String lambarkaMMT = input.next();
                        System.out.print("Gali lacagta aad ugu shubayso: ");
                        double lacagtaMMT = input.nextDouble();
                        if (lacagtaMMT > haraaga) {
                            System.out.println(" Haraag xisabtda kuguma filna.");
                        } else {
                            haraaga -= lacagtaMMT;
                            System.out.println("Waxad ugu shubtay $" + lacagtaMMT + " qofka lambarkiisu yahay: " + lambarkaMMT);
                            System.out.println("Haraagaaga waa: $" + haraaga);
                        }


                    default:
                        System.out.println("Doorasho khaldan!");
                }
                break;

            //BIXI BIIIL
            case 3:
                System.out.println("Bixi Biilka");
                double Bill_Balance = 50;
                System.out.println("Fadlan dooro 1. Boostada la bixiyay 2. Ku iibso");
                int Bill_Options = input.nextInt();
                if (Bill_Options == 1) {
                    System.out.println(" Boostada la bixiyay:\n " + "1. Ogow Biil-ka \n " + "2. Bixi Biilka \n " + "3. Ka bixi biilka");

                    int PostPaid_Options = input.nextInt();
                    switch (PostPaid_Options) {
                        case 1:
                            System.out.println("Haraaga Bill-kaagu waa $" + Bill_Balance);
                            break;
                        case 2:
                            System.out.println("Fadlan Geli Lacagta: ");
                            double Bixi_biilka = input.nextInt();
                            System.out.println("Ma hubtaa inaad bixisid Bill lacagtisu ay tahay $" + Bixi_biilka + " (1. Haa 2. Maya)");
                            int Bixi_biilka_YesOrNo = input.nextInt();
                            if (Bixi_biilka_YesOrNo == 1) {
                                System.out.println("Waxaad bixisay Bill lacagatisu ay dhan tahay $" + Bixi_biilka + " Mahadsanid");
                            } else {
                                System.out.println("Mahadsanid");
                            }
                            break;
                        case 3:
                            System.out.println("Ka bixi Bill");
                            System.out.println("Fadlan Geli Mobile-ka: ");
                            int Mobile_number = input.nextInt();
                            System.out.println("Fadlan Geli Lacagta: ");
                            double Lacagta = input.nextDouble();
                            if (Bill_Balance < Lacagta) {
                                System.out.println("Haraagaagu Bill-ka kuguma filna");
                            } else {
                                System.out.println("Mahubtaa inaad bixisid Bill lacagtisu tahay $" + Lacagta + " oolaga rabo tel no " + Mobile_number + " (1. Yes 2. No)");
                                int Bill_YesOrNo = input.nextInt();
                                if (Bill_YesOrNo == 1) {
                                    System.out.println("Waxaad bixisay bill lacagtisu ay tahay $" + Lacagta + " kana dirtay " + Mobile_number);
                                } else {
                                    System.out.println("Mahadsanid \n ");
                                }
                            }
                    }
                } else if (Bill_Options == 2) {
                    System.out.println("Ku iibso");
                    System.out.println("Fadlan geli aqoonsiga: ");
                    int Aqoonsiga_Ganacsiga = input.nextInt();
                    System.out.println("Fadlan Geli Lacagta: ");
                    double LacagtaAqonsiga = input.nextDouble();
                    System.out.println("Mahubtaa inaa ku iibsatid $" + LacagtaAqonsiga + " kana iibsatid " + Aqoonsiga_Ganacsiga + " (1. Haa 2. Maya )");
                    int submit_YesOrNo = input.nextInt();
                    double NewBill_Balance = Bill_Balance - LacagtaAqonsiga;
                    if (submit_YesOrNo == 1) {
                        System.out.println("Waxaad ku iibsatay $" + LacagtaAqonsiga + " kana iibsatay " + Aqoonsiga_Ganacsiga + " Haraagaagu waa " + NewBill_Balance + " Mahadsanid");
                    } else {
                        System.out.println("Mahadsanid");
                    }
                }
                break;



            case 4:
                System.out.println("EVCPlus");
                System.out.println(" U wareeji EVCPlus");
                System.out.print("Fadlan gali mobile number-ka: ");
                String mobileNumber = input.nextLine();
                System.out.print("Fadlan gali lacagta aad rabto inaad wareejiso: ");
                int mobilenumber = input.nextInt();
                if (mobilenumber > 9) ;
                System.out.println("Numberkan ma ahan mid jiro");
                double lacgta = input.nextDouble();
                if (lacgta > haraaga) {
                    System.out.println("Haraag kugu filan ma haysid.");
                } else {
                    haraaga -= lacgta;
                    System.out.println("<-EVCPlus-> " + lacgta + "$  ayaad uwarejiay: " + mobileNumber);
                    System.out.println("Haraagaaga cusub waa: $" + haraaga);
                }
                break;


            //5.Qeybta Warbixinta
            case 5:
                System.out.println(" Warbixin Kooban: \n " + "1. Last Action \n " + "2. Wareejintii Ugu Dambeysay \n " + "3. Iibsashadii Ugu Dambeysay \n " + "4. Last 3 Actions \n " + "5. Email Me My Activity");
                int Doorashada_Wareejinta = input.nextInt();
                if (Doorashada_Wareejinta == 1) {
                    System.out.println("$5 ayaad uwareejisay 252615074876, Taariikh: 25/04/2025 08:06:00");
                } else if (Doorashada_Wareejinta == 2) {
                    System.out.println("Statementiga: \n " + "1. U dirtay \n " + "2. Ka Heshay ");
                    int Warejinta_Hadalka = input.nextInt();
                    if (Warejinta_Hadalka == 1) {
                        System.out.println("Fadlan Geli Lambarka aad udirtay: ");
                        int Numberka_SooDiray = input.nextInt();
                        System.out.println("$2 ayaad uwareejisay " + Numberka_SooDiray + ", Taariikh: 16/02/25 18:09:30");
                    } else if (Warejinta_Hadalka == 2) {
                        System.out.println("Fadlan Geli Number-ka aad ka heshay: ");
                        int Loo_Diraha = input.nextInt();
                        System.out.println("Operation succeeded No Recieved Transactions to display!");
                    }
                } else if (Doorashada_Wareejinta == 3) {
                    System.out.println("Fadlan Geli Aqoonsiga Ganacsiga: ");
                    int Aqoonsiga_Ganacsiga = input.nextInt();
                    System.out.println("Hawlgalkaan wuxuu ku guulaystey Wax macaamil ganacsi ah si loo muujiyo lambarkan!");

                } else if (Doorashada_Wareejinta == 4) {
                    System.out.println("Fadlan Geli Aqoonsiga Ganacsiga ");
                    int Aqoonsiga_Ganacsiga = input.nextInt();
                    System.out.println("Hawlgalkan wuxuu ku guulaystey Wax macaamil ah oo la soo bandhigay!");
                } else if (Doorashada_Wareejinta == 5) {
                    System.out.println("Fadlan Geli Email-kaga");
                    String Email_Me = input.nextLine().trim().toLowerCase();
                    System.out.println("Geli Taariikhda Hore (Maalin/Bisha/Sanadka) : ");
                    String Taariikh_Hore = input.nextLine().trim().toLowerCase();
                    System.out.println("Geli Taariikhda Dambe (Maalin/Bisha/Sanadka) : ");
                    String Taariikh_Dambe = input.nextLine().trim().toLowerCase();
                    System.out.println("Codsigaagii waa la habeeyey oo hawsha waxa loo soo diri doonaa iimayl\n " + Email_Me);
                } else {
                    System.out.println("Selection Error: Fadlan Dooro 1 - 5");
                }
                break;


            //6.Qeybta Salaam-Bank
            case 6:
                System.out.println("Salaam Bank: \n " +
                        "1. Itus Haraagaaga \n " +
                        "2. Lacag Dhigasho \n " +
                        "3. Lacag Qaadahso \n " +
                        "4. Ka wareeji EVCP-lus \n " +
                        "5. Ka wareeji Account-kaga \n " +
                        "6. Hubi Wareejinta Account-kaga \n " +
                        "7. Maaraynta Bank-ga \n " +
                        "8. Kala bax ");
                int SalaamBank_Options = input.nextInt();
                int Bank_PIN_Number = 1313;
                int Bank_Number = 2299330;
                double Bank_Balance = 6000;
                String Bank_Account_Holder = "Rayaan Abdullahi Kasim";
                //Itus Haragaga
                if (SalaamBank_Options == 1) {
                    System.out.println("Fadlan Geli Number-kaga sirta ee Bank-ga");
                    int Bank_PIN_Code = input.nextInt();
                    if (Bank_PIN_Code == Bank_PIN_Number) {
                        System.out.println("Koontada Bank-ga:" + Bank_Number + " " + Bank_Account_Holder + " Haraagaagu waa $" + Bank_Balance + " USD");
                    } else {
                        System.out.println("Incorrect Bank Password");
                    }
                } else if (SalaamBank_Options == 2) {
                    System.out.println("Fadlan Geli Lacagta: ");
                    double LacagDhigasho = input.nextDouble();
                    System.out.println("Fadlan Geli Macluumaad: ");
                    input.nextLine();
                    String Maclumad = input.nextLine();
                    System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                    int Bank_PIN_Code = input.nextInt();
                    if (Bank_PIN_Code == Bank_PIN_Number) {
                        System.out.println("Ma hubtaa inaad $" + LacagDhigasho + " dhigatid Accountkaga Bank-ga? (1. Haa 2. Maya)");
                        int Bank_Dhigasho_Yes_Or_No = input.nextInt();
                        if (Bank_Dhigasho_Yes_Or_No == 1) {
                            double NewBalance = LacagDhigasho + Bank_Balance;
                            System.out.println("Waxaad ku guuleysatay inaad $" + LacagDhigasho + " dhigatid Bank-kaga " + Bank_Number + " Haraagaagu cusub ee koontada waa $" + NewBalance);
                        } else {
                            System.out.println("Mahadsanid");
                        }
                    }
                } else if (SalaamBank_Options == 3) {
                    System.out.println("Fadlan Soo Geli Lacagta:");
                    double Lacag_Qaadasho = input.nextDouble();
                    System.out.println("Fadlan Geli Macluumaad: ");
                    input.nextLine();
                    String Qadasho_Maclumad = input.nextLine();
                    String Maclumad = input.nextLine();
                    System.out.println("Fadlan Geli Number-kaga Sirta ee Bank-ga: ");
                    int Bank_PIN_Code = input.nextInt();
                    if (Bank_PIN_Code == Bank_PIN_Number) {
                        System.out.println("Ma hubtaa inaad $" + Lacag_Qaadasho + " ka qaadatid Account kaga Bank-ga? (1. Haa 2. Maya)");
                        int Bank_Qaadasho_Yes_Or_No = input.nextInt();
                        double newBalance = Bank_Balance - Lacag_Qaadasho;
                        if (Bank_Balance < Lacag_Qaadasho) {
                            System.out.println("Haraagaaga koontadu kuguma filna ");
                        } else {
                            if (Bank_Qaadasho_Yes_Or_No == 1) {
                                System.out.println("Waxaad ku guuleysatay inaad $" + Lacag_Qaadasho + " Haraagaaga cusub ee koontadu waa $" + newBalance);
                            } else {
                                System.out.println("Mahadsanid");
                            }
                        }


                    }
                } else if (SalaamBank_Options == 4) {
                    System.out.println("Ka wareeji EVCPlus: \n " +
                            "1. Salaam Somali Bank \n " +
                            "2. Salaam SCH \n " +
                            "3. Bank Beeraha \n " +
                            "4. Daarusalam Bank \n " +
                            "5. MyBank LTD");
                    int Ka_Wareeji_Options = input.nextInt();
                    if (Ka_Wareeji_Options == 1) {
                        System.out.println("Fadlan Geli Account-kaga ");
                        int Account_Number = input.nextInt();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        input.nextLine();
                        String Maclumad = input.nextLine();
                        System.out.println("Invalid");
                    } else if (Ka_Wareeji_Options == 2) {
                        System.out.println("Fadlan Geli Account-kaga ");
                        int Account_Number = input.nextInt();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        input.nextLine();
                        String Maclumad = input.nextLine();
                        System.out.println("Invalid");
                    } else if (Ka_Wareeji_Options == 3) {
                        System.out.println("Fadlan Geli Account-kaga ");
                        int Account_Number = input.nextInt();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        input.nextLine();
                        String Maclumad = input.nextLine();
                        System.out.println("Invalid");
                    } else if (Ka_Wareeji_Options == 4) {
                        System.out.println("Fadlan Geli Account-kaga ");
                        int Account_Number = input.nextInt();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        input.nextLine();
                        String Maclumad = input.nextLine();
                        System.out.println("Invalid");
                    } else if (Ka_Wareeji_Options == 5) {
                        System.out.println("Fadlan Geli Account-kaga ");
                        int Account_Number = input.nextInt();
                        System.out.println("Fadlan Geli Macluumaad: ");
                        input.nextLine();
                        String Macluumaad = input.nextLine();
                        System.out.println("Invalid");
                    } else {
                        System.out.println("Selection Error: Fadlan Dooro Numberska (1 - 5)");
                    }
                } else if (SalaamBank_Options == 5) {
                    System.out.println("Account to Account: ");
                    System.out.println("Fadlan Geli Account ama Mobile Number: ");
                    int Account_Mobile = input.nextInt();
                    System.out.println("Fadlan Geli Lacagta: ");
                    double Lacagta_Account = input.nextDouble();
                    System.out.println("Fadlan Geli Macluumaad: ");
                    input.nextLine();
                    String Maclumad = input.nextLine();
                    System.out.println("Fadlan Geli Number-ka sirta ah: ");
                    int BankPINCode = input.nextInt();
                    if (Bank_PIN_Number == BankPINCode) {
                        System.out.println("Ma hubtaa inaad $" + Lacagta_Account + " u wareejisid Account Number-ka " + Account_Mobile + " ( 1. Haa 2. Maya)");
                        int Account_Warejin_Yes_Or_No = input.nextInt();
                        if (Account_Warejin_Yes_Or_No == 1) {
                            System.out.println("Waxaad ku guuleysatay inaad $" + Lacagta_Account + " u wareejisid koontada " + Account_Mobile + " Mahadsanid!");
                        } else {
                            System.out.println("Mahadsanid");
                        }
                    } else {
                        System.out.println("Incorrect PIN Code");
                    }

                } else if (SalaamBank_Options == 6) {
                    System.out.println("Fadlan Geli On-Time-Password-ga");
                    int OnTimePassword = input.nextInt();
                    System.out.println("Invalid");
                } else if (SalaamBank_Options == 7) {
                    System.out.println("Maareynta Bank-ga: \n " +
                            "1. Bedel PIN-ka Bank-ga \n " +
                            "2. Bedel Password-ka E-Bank-ga");

                    int Maareynta_Bankga = input.nextInt();


                    if (Maareynta_Bankga == 1) {
                        System.out.println("Fadlan Geli PIN-kaaga Cusub ee koontada:");
                        int NewBank_PIN_Code = input.nextInt();
                        System.out.println("Ku celi PINkaga cusub ee koontada");
                        int Confirm_PIN_Code = input.nextInt();
                        if (NewBank_PIN_Code == Confirm_PIN_Code) {
                            System.out.println("Waxaad ku guuleysatay inaad badasho binkkaga sirta ah ee koontada");
                        } else {
                            System.out.println("Confirm Password Not Matching");
                        }
                    } else if (Maareynta_Bankga == 2) {
                        System.out.println("Fadlan Geli PIN-ka Cusub ee koontada E-Bank:");
                        int NewE_Bank_PIN_Code = input.nextInt();
                        System.out.println("Ku celi PIN ka cusub ee koontada");
                        int Confirm_PIN_Code = input.nextInt();
                        if (NewE_Bank_PIN_Code == Confirm_PIN_Code) {
                            System.out.println("Waxaad ku guuleysatay inaad badasho bin kaga sirta ee koontada E-Bank:");
                        } else {
                            System.out.println("Confirm Password Not Matching");
                        }
                    }
                } else if (SalaamBank_Options == 8) {
                    System.out.println("Fadlan dooro Aqoonsiga Codsiga: ");
                    int Aqoonsiga = input.nextInt();
                    System.out.println("Invalid");
                } else {
                    System.out.println("Selection Error: Fadlan Dooro (1 - 8)");
                }
                break;


            //7.Qeybta Maareynta
            case 7:
                System.out.println("Maareynta");
                System.out.println("Maareynta \n " +
                        "1. Bedel Lambarka Sirta ah \n " +
                        "2. Bedel Luqadda \n " +
                        "3. Wargelin Mobile Lumay \n " +
                        "4. Lacag Xayiraad \n " +
                        "5. U celi Lacag Qaldantay ");


                int Maaraynta_Options = input.nextInt();
                if (Maaraynta_Options == 1) {
                    System.out.println("Fadlan Geli PIN kaga cusub");
                    int PINCode_Cusub = input.nextInt();
                    System.out.println("Hubi PIN-Kaga cusub");
                    int ConfirmPINCode = input.nextInt();
                    if (ConfirmPINCode == PINCode_Cusub) {
                        System.out.println("[-EVC-Plus] wad ku guleysatay inaa badasho PIN-kaga");
                    } else {
                        System.out.println("Confirm PIN code is not matching the new PIN code");
                    }

                } else if (Maaraynta_Options == 2) {
                    System.out.println("Fadlan Dooro Luqadda: (1. Somali 2. English)");
                    int dorashada_luqada = input.nextInt();
                    if (dorashada_luqada == 1) {
                        System.out.println("[-EVCPlus-] Waad ku guuleysatay in aad badasho luqadda");
                    } else if (dorashada_luqada == 2) {

                        System.out.println("[-EVCPlus-] You have successfully changed your language");
                    } else {
                        System.out.println("Selection Error)");
                    }


                } else if (Maaraynta_Options == 3) {
                    System.out.println("Fadlan Geli Mobile-ka Lumay: ");
                    int Mobileka_lumay_PIN_codekisa = 2323;
                    int mobileka_lumay = input.nextInt();
                    System.out.println("Fadlan Geli Number-kisa sirta ah: ");
                    int LostMobilePINCode = input.nextInt();
                    if (LostMobilePINCode == Mobileka_lumay_PIN_codekisa) {
                        System.out.println("Waad ku mahadsan tahay wargelintada waxaana kugu adeegi doonnaa sida ugu dhaqsiyaha badan");
                    } else {
                        System.out.println("Number sireedka aad galisay waa qalad , Fadlan ku celi mar kle");
                    }


                } else if (Maaraynta_Options == 4) {
                    System.out.println("Fadlan Geli Number-ka lagu khalday: ");
                    int Lagu_Khalday = input.nextInt();
                    System.out.println("Fadlan Geli Lambarka loo waday: ");
                    int Numberka_lowaday = input.nextInt();
                    System.out.println("Fadlan Geli Macluumaad");

                    String Maclumad = input.nextLine().trim().toLowerCase();
                    System.out.println("Ma hubtaa inaad xirato lacagta (1. Haa 2. Maya)");
                    int Maclumad_Yes_Or_No = input.nextInt();

                    if (Maclumad_Yes_Or_No == 1) {
                        System.out.println("Waxaan kuugu adeegi doonna sida ugu dhaqsiyaha badan Mahadsanid!");
                    } else {
                        System.out.println("Mahadsanid");
                    }

                    break;
                }

                //8.Bill-ka
            case 8:
                System.out.println("Bill Payement");
                System.out.println("-- EVCPlus -- \n " +
                        "1. Itus Haraagaaga Bill-ka: \n " +
                        "2. Wada Bixi Bill-ka \n " +
                        "3. Qayb Ka bixi Bill-ka");
                int Bill_Payement_Options = input.nextInt();



                //Haraga
                if (Bill_Payement_Options == 1) {
                    System.out.println("Fadlan Geli numberka tixraaca: ");
                    int Numberka_Tixraaca = input.nextInt();
                    System.out.println("Haraagaagu Bill-ka waa $500");

                    //wada bixnta bill-ka
                } else if (Bill_Payement_Options == 2) {
                    System.out.println("Fadlan Geli Reference Number: ");
                    int Numberka_Tixraca = input.nextInt();
                    System.out.println("Waa lawada Bixiyay Bill-ka! Mahadsanid");




                    //Qeybta ka bixida
                } else if (Bill_Payement_Options == 3) {
                    System.out.println("Fadlan Geli Number-ka aad udirayso Bill-ka");
                    int To_Bill_user = input.nextInt();
                    System.out.println("Fadlan Geli Lacagta Bill-ka");
                    double Lacagta_Billka = input.nextDouble();
                    System.out.println("Waxaad ku guuleysatay inaad qayb ka bixiso Bill-ka!  Mahadsanid");
                }
                break;


            default:
                System.out.println("Ma jiro numberkan. isku dey mar kale");


        }

    }
}
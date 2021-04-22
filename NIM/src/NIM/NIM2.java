package NIM;

public class NIM2{
    public static void main(String[] args) {
        String nim = "12050123494";
        NIM2 objNim = new NIM2();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan:" + objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk:" + objNim.getTahunMasuk());
        System.out.println("Fakultas:" + objNim.getFakultas());
        System.out.println("Jurusan:" + objNim.getJurusan());
        System.out.println("Jenis Kelamin:" + objNim.getJenisKelamin());
        System.out.println(objNim.getNomorUrut());


    }
}
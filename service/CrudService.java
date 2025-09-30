/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Tiket;
import java.util.List;

/**
 *
 * @author Tuf Gaming
 */
public interface CrudService {
    void tambahTiket(Tiket tiket);
    void tampilkanTiket();
    void updateTiket(int index, Tiket tiket);
    void hapusTiket(int index);
    void cariTiket(String keyword);
    List<Tiket> getAllTiket();
}

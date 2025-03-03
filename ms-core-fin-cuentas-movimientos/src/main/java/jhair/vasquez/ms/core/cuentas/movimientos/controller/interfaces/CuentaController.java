package jhair.vasquez.ms.core.cuentas.movimientos.controller.interfaces;

import db.repositorio.financiero.entity.Cuenta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CuentaController {
    @GetMapping("/{numCuenta}")
    ResponseEntity<Cuenta> getCuentaByNumCuenta(@PathVariable String numCuenta);

    @GetMapping
    ResponseEntity<List<Cuenta>> getAllCuentas();

    @PostMapping
    ResponseEntity<Cuenta> createCuenta(@RequestBody Cuenta cuenta);

    @DeleteMapping("/{numCuenta}")
    ResponseEntity<Void> deleteCuenta(@PathVariable String numCuenta);
}

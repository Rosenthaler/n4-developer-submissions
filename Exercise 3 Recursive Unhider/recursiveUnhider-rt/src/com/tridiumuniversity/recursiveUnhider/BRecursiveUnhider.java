package com.tridiumuniversity.recursiveUnhider;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BAbstractService;
import javax.baja.sys.Flags;

@NiagaraType

@NiagaraProperty(
        name = "rootOrd",
        type = "BOrd",
        defaultValue = "BOrd.null"
)

@NiagaraProperty(
        name = "regex",
        type = "String",
        defaultValue = "\"\"",
        flags = Flags.SUMMARY
)

public abstract class BRecursiveUnhider extends BAbstractService
{
}

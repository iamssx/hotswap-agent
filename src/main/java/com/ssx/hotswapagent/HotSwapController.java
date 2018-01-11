package com.ssx.hotswapagent;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import javassist.util.HotSwapAgent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HotSwapController {

    private HotSwapClass hotSwapClass = new HotSwapClass();

    @GetMapping("/")
    public Object index() {
        return hotSwapClass.print();
    }

    @GetMapping("/hotswap")
    public void hotswap() throws NotFoundException, IOException, CannotCompileException {
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.get("com.ssx.hotswapagent.HotSwapClass");
        HotSwapAgent.redefine(HotSwapClass.class, ctClass);
    }

}

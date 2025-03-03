package com.ben.codojcodesandbox;


import com.ben.codojcodesandbox.model.ExecuteCodeRequest;
import com.ben.codojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

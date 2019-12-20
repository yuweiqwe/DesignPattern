package com.ckp.test.handler;

public abstract class Handler {
	
	private Handler nextHandler;
	
	public Response handleMessage(Request request){
		Response response = null;
		//判断是否是自己的处理级别
		if(this.getHandlerLevel().equals(request.getRequestLevel())){
			response = this.handle(request);
		}else{
			//不属于自己的处理级别
			//判断是否有下一个处理者
			if(this.nextHandler != null){
				System.out.println("将请求传递给下一个请求" + this.nextHandler);
				response = this.nextHandler.handleMessage(request);
			}else{
				//没有适当的处理者，业务自行处理
				System.out.println("没有适当的处理者，业务自行处理" + this);
			}
		}
		
		return response;
	}
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract Level getHandlerLevel();
	
	public abstract Response handle(Request request);
	
}

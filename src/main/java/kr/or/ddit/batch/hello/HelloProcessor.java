package kr.or.ddit.batch.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class HelloProcessor implements ItemProcessor<String, String>{

	private Logger logger = LoggerFactory.getLogger(HelloProcessor.class);
	
	@Override
	public String process(String ranger) throws Exception {
		String processedRanger = ranger + "_PROCESSED";
		logger.debug("processedRanger : {}", processedRanger);
		return processedRanger;
	}

}

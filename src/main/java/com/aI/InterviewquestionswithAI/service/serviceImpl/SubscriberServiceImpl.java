package com.aI.InterviewquestionswithAI.service.serviceImpl;

import com.aI.InterviewquestionswithAI.dto.SubscriberDTO;
import com.aI.InterviewquestionswithAI.entity.Subscriber;
import com.aI.InterviewquestionswithAI.exception.ApplicationBusinessException;
import com.aI.InterviewquestionswithAI.mapper.SubscriberMapper;
import com.aI.InterviewquestionswithAI.repository.SubscriberRepository;
import com.aI.InterviewquestionswithAI.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SubscriberServiceImpl implements SubscriberService {
    @Autowired

    private SubscriberRepository subscriberRepository;
    @Override
    public SubscriberDTO createSubscriberDTO(SubscriberDTO subscriberDTO) throws ApplicationBusinessException {
        try {
        Subscriber subscriberEntity = SubscriberMapper.convertToEntity(subscriberDTO);
        subscriberEntity.setSubscriberId(subscriberDTO.getSubscriberId());
        subscriberEntity.setSubscriberName(subscriberEntity.getSubscriberName());
        subscriberEntity.setSubscriptionStartDate(subscriberDTO.getSubscriptionStartDate());
        subscriberEntity.setSubscriptionEndDate(subscriberDTO.getSubscriptionEndDate());

        Subscriber saveSubscriber = subscriberRepository.save(subscriberEntity);
        return SubscriberMapper.convertToDTO(saveSubscriber);
    }catch (ApplicationBusinessException a){
            throw  new ApplicationBusinessException("error to create Subscriber");
        }
    }

    @Override
    public List<SubscriberDTO> getAllSubscriberDTO() {
        List<Subscriber> findAll= subscriberRepository.findAll();

        List<SubscriberDTO> subscribes = findAll.stream()
                .map(e->SubscriberMapper.convertToDTO(e))
                .collect(Collectors.toList());

        return subscribes;
    }

    @Override
    public SubscriberDTO updateSubscriberDTOById(Long subscriberId, SubscriberDTO subscriberDTO) throws ApplicationBusinessException {
        try {
            Subscriber subscriber = subscriberRepository.findById(subscriberId).orElseThrow(() -> new ApplicationBusinessException("Subscriber is not found"));
            subscriber.setSubscriberName(subscriberDTO.getSubscriberName());
            subscriber.setSubscriptionStartDate(subscriberDTO.getSubscriptionStartDate());
            subscriber.setSubscriptionEndDate(subscriberDTO.getSubscriptionEndDate());

            Subscriber updateSubscriber = subscriberRepository.save(subscriber);

            return SubscriberMapper.convertToDTO(updateSubscriber);
        }catch (ApplicationBusinessException a){
            throw  new ApplicationBusinessException("SubscriberId Not founded...!");
        }
    }

    @Override
    public SubscriberDTO deleteSubscriberDTOById(Long subscriberId) throws ApplicationBusinessException {

        Subscriber deleteSubscriber = subscriberRepository.findById(subscriberId).orElseThrow(()-> new ApplicationBusinessException("Subscribe Not founded....!"));
        subscriberRepository.deleteById(subscriberId);
        return SubscriberMapper.convertToDTO(deleteSubscriber);
    }
}

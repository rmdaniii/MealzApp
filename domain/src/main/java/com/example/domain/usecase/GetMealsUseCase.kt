package com.example.domain.usecase

import com.example.domain.repo.MealsRepo

class GetMealsUseCase (private val mealsRepo: MealsRepo){

    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()

}
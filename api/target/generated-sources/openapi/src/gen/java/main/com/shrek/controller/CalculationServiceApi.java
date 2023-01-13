/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.shrek.controller;

import com.shrek.model.CreditDTO;
import com.shrek.model.CustomizedException;
import com.shrek.model.ScoringDataDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-12T23:37:51.668990300+03:00[Europe/Moscow]")
@Validated
@Tag(name = "CalculationService", description = "The calculation of loan variations")
public interface CalculationServiceApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /conveyor/calculation : Creating CreditDTO
     *
     * @param scoringDataDTO  (required)
     * @return Successful calculation response (status code 200)
     *         or Error 400 Bad request (status code 400)
     *         or Refuse loan request (status code 200)
     */
    @Operation(
        operationId = "calculation",
        summary = "Creating CreditDTO",
        tags = { "CalculationService" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful calculation response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreditDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Error 400 Bad request"),
            @ApiResponse(responseCode = "200", description = "Refuse loan request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CustomizedException.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/conveyor/calculation",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CreditDTO> calculation(
        @Parameter(name = "ScoringDataDTO", description = "", required = true) @Valid @RequestBody ScoringDataDTO scoringDataDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 10000.080082819046, \"isSalaryClient\" : true, \"monthlyPayment\" : 1.4658129805029452, \"rate\" : 5.962133916683182, \"paymentSchedule\" : [ { \"date\" : \"2000-01-23\", \"interestPayment\" : 9.301444243932576, \"number\" : 2, \"totalPayment\" : 7.061401241503109, \"debtPayment\" : 3.616076749251911, \"remainingDebt\" : 2.027123023002322 }, { \"date\" : \"2000-01-23\", \"interestPayment\" : 9.301444243932576, \"number\" : 2, \"totalPayment\" : 7.061401241503109, \"debtPayment\" : 3.616076749251911, \"remainingDebt\" : 2.027123023002322 } ], \"psk\" : 5.637376656633329, \"term\" : 6, \"isInsuranceEnabled\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

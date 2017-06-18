/**
 * Created by willi on 17/06/2017.
 */

$(function () {

    var decimal = $('.js-decimal');
    decimal.maskMoney();

    var plain = $('.js-plain');
    plain.maskMoney({precision: 0});

});